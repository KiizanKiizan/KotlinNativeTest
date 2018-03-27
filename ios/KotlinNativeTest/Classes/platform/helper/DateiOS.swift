//
//  DateiOS.swift
//  KotlinNativeTest
//
//  Created by 岩井 宏晃 on 2018/03/24.
//  Copyright © 2018年 kiizan-kiizan.co.jp. All rights reserved.
//

import Foundation
import TestNativeLibs

class DateiOS: NSObject, TNLDate {
    
    let calendar = Calendar(identifier: .gregorian)
    let formatter = DateFormatter()
    
    override init() {
        super.init()
        let jaLocale = Locale(identifier: "ja_JP")
        formatter.locale = jaLocale
    }
    
    func dateWithFormat(format: String, dateComponents: TNLDateComponents) -> String {
        guard let date = calendar.date(from: createDateComponents(libComponents: dateComponents)) else {
            return ""
        }
        formatter.dateFormat = format
        return formatter.string(from: date)
    }
    
    private func createDateComponents(libComponents: TNLDateComponents) -> DateComponents {
        var components = DateComponents()
        components.year = libComponents.year.to_i()
        components.month = libComponents.month.to_i()
        components.day = libComponents.day.to_i()
        return components
    }
}

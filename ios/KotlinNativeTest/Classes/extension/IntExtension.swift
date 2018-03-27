//
//  IntExtension.swift
//  KotlinNativeTest
//
//  Created by 岩井 宏晃 on 2018/03/24.
//  Copyright © 2018年 kiizan-kiizan.co.jp. All rights reserved.
//

import Foundation

extension Int {
    // KotlinでいうLongに変換
    func to_kl() -> Int64 {
        return Int64(self)
    }
    
    // KotlinでいうIntに変換
    func to_ki() -> Int32 {
        return Int32(self)
    }
}

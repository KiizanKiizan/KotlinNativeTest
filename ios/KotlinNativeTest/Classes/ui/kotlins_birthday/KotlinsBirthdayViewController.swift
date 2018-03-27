//
//  KotlinsBirthdayViewController.swift
//  KotlinNativeTest
//
//  Created by 岩井 宏晃 on 2018/03/25.
//  Copyright © 2018年 kiizan-kiizan.co.jp. All rights reserved.
//

import UIKit
import TestNativeLibs

class KotlinsBirthdayViewController: UIViewController {
    @IBOutlet weak var dateLabel: UILabel!
    
    let presenter = TNLKotlinsBirthdayPresenter(date: DateiOS())
    
    class func createViewController() -> KotlinsBirthdayViewController {
        return UIStoryboard(name: "KotlinsBirthdayViewController", bundle: nil).instantiateInitialViewController() as! KotlinsBirthdayViewController
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()

        title = TNLHomeMenu.kotlinsbirthday.title()
        dateLabel.text = presenter.kotlinsBirthday()
    }
}

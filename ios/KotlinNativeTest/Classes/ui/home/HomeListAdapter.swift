//
//  HomeListAdapter.swift
//  KotlinNativeTest
//
//  Created by 岩井 宏晃 on 2018/03/24.
//  Copyright © 2018年 kiizan-kiizan.co.jp. All rights reserved.
//

import Foundation
import UIKit
import TestNativeLibs

class HomeListAdapter: NSObject, UITableViewDataSource {
    let presenter: TNLHomeListPresenter
    
    init(presenter: TNLHomeListPresenter) {
        self.presenter = presenter
    }
    
    func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return presenter.titles().count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "HomeTableViewCell", for: indexPath)
        cell.textLabel?.text = presenter.titles()[indexPath.row]
        return cell
    }
}

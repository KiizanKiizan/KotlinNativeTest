//
//  HomeViewController.swift
//  KotlinNativeTest
//
//  Created by 岩井 宏晃 on 2018/03/22.
//  Copyright © 2018年 kiizan-kiizan.co.jp. All rights reserved.
//

import UIKit
import TestNativeLibs

class HomeViewController: UIViewController, TNLHomeView, UITableViewDelegate {

    @IBOutlet weak var tableView: UITableView!
    
    let presenter = TNLHomePresenter()
    let adapter = HomeListAdapter(presenter: TNLHomeListPresenter())
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        tableView.dataSource = adapter
        tableView.delegate = self
    }

    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        
        presenter.homeView = self
        
        deselectTableRow()
    }

    override func viewDidDisappear(_ animated: Bool) {
        super.viewDidDisappear(animated)
        
        presenter.homeView = nil
    }

    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        presenter.tappedListAt(index: indexPath.row.to_kl())
    }
    
    func toKotlinsBirthdayActivity() {
        navigationController?.pushViewController(KotlinsBirthdayViewController.createViewController(), animated: true)
    }
}

private extension HomeViewController {
    func deselectTableRow() {
        if let selected = tableView.indexPathForSelectedRow {
            tableView.deselectRow(at: selected, animated: true)
        }
    }
}


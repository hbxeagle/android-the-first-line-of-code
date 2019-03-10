//
//  ViewController.m
//  HelloWord
//
//  Created by Ezio Huang on 2019/3/10.
//  Copyright © 2019 Ezio Huang. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    
    CGRect rect = CGRectMake((self.view.frame.size.width - 100) / 2, (self.view.bounds.size.height - 100) / 2, 100, 100);
    
    UITextField *field = [[UITextField alloc]initWithFrame:rect];
    field.text = @"Hello World!";
    
    [self.view addSubview:field];
}


@end

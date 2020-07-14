import { Component, OnInit } from '@angular/core';
import {TestComponent} from '../test/test.component';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {
  private review:number=0;
  private wrong:number=0;
  private sampleTest:TestComponent;  
  constructor() { }

  ngOnInit() {
    this.sampleTest = new TestComponent();
    this.review = this.sampleTest.getResult();
    this.wrong = 5-this.review;
    console.log(this.review)
  }

}

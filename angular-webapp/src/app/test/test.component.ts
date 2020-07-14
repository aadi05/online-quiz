import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';
import {Test} from '../test';
import { QuestionAnswer } from '../question-answer';
import { Router } from '@angular/router';
import {Temp} from '../temp';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  private test:Test;
  public static result:number;
  private questionAnswerList:Array<QuestionAnswer>;
  constructor(private service?:TestService,private router?: Router) {
    this.test = new Test();
   }

  async submitTest(){
    this.test.quiz = this.questionAnswerList;
    TestComponent.result = await this.service.submitTest(this.test).toPromise();
    this.service.pushResult(TestComponent.result);
    console.log(TestComponent.result);
    this.goToReview();
    
  }

  goToReview(){
    this.router.navigate(['/review']);
  }

  ngOnInit() {
    this.service.getNewTest().subscribe(res=>{
      this.questionAnswerList=res.quiz
      if (undefined !== this.questionAnswerList && this.questionAnswerList.length){
        for(let i=0;i<this.questionAnswerList.length;i++){
          this.questionAnswerList[i].ans=0;
        }
      }});
  }
  getResult(){
    return TestComponent.result;
  }

}

import { ResultsComponent } from "./results/results.component";
export class Temp{
    public static results:number[]=[];
    public static getResults(){
        return Temp.results;
    }
    public static pushResult(res:number){
        Temp.results.push(res);
    }
}


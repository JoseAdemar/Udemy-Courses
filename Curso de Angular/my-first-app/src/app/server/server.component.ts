import { Component } from "@angular/core";

@Component({
    selector: 'app-server',
    templateUrl: './server.component.html',
    styleUrls: ['./server.component.css']
})
export class ServerComponent {

  serverId: number = 10;
  serverStatus: string = 'Status OffLine';
  

  constructor(){
    this.serverStatus = Math.random() > 0.5 ? 'Status Online' : 'Status OffLine';
  }

  getServerStatus(){
    return this.serverStatus;
  }

  getColor(){
    return this.serverStatus === 'Status Online' ? 'green' : 'red';
  }
}
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  
  allowNewServer = false;
  serverCreationStatus  = 'No sever was created"'
  serverName = 'digite aqui';
  serveCreated = false;
  servers = [];

  constructor(){
    setTimeout(()=>{
      this.allowNewServer = true;
    }, 2000);
  }
  ngOnInit(){
    
  }

  onCreateServer(){
    this.serveCreated = true;
    this.servers.push(this.serverName)
    this.serverCreationStatus = 'The serve was created!';
  }

  onUpadteServerName(event: Event){
    this.serverName = (<HTMLInputElement>event.target).value;
  }

}

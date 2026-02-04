import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  getProjects() {
    return 'Fetching projects from backend';
  }
}

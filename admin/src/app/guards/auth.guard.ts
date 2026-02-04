import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard {

  isLoggedIn(): boolean {
    // later: token validation
    return true;
  }
}

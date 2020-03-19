 package com.example.simplerestapis.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.simplerestapis.models.PostRequest;
import com.example.simplerestapis.models.PostResponse;


@RestController
public class WebController {

	
	
	@RequestMapping(value = "/emails", method = RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest inputPayload) {
		PostResponse response = new PostResponse();
		response.setnumOfLists(numUniqueEmails(inputPayload.getEmailList()));
		response.setMessage("Number of emails are");
		
		return response;
  }
  public static int numUniqueEmails(String[] mails) {
      Set<String> seen = new HashSet();
      for (String email : mails) {
        int i = email.indexOf('@');
        String local = email.substring(0, i);
        String rest = email.substring(i);
        if (local.contains("+")) {
          local = local.substring(0, local.indexOf('+'));
        }
        // Note: one should escape the specific character '.',
        // since it is treated as a regex expression.
        local = local.replaceAll(".", "");
        seen.add(local + rest);
      }
    
      return seen.size();
}
}
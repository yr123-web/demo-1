package edu.swjtuhc.demo.controller;

import java.io.IOException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.swjtuhc.demo.model.Comment;
import edu.swjtuhc.demo.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	CommentService commentService;
	
	@RequestMapping("/getList")
	public List<Comment> getList(){
		
		return commentService.getCommentList();
	}
	@RequestMapping("/createComment")
	public int createComment(Comment comment, MultipartFile file) {
		System.out.println(comment);
		System.out.println(file.getOriginalFilename());
		comment.setContent(file.getOriginalFilename());
		try {
			commentService.createComment(comment,file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

}

}

package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import model.Comment;
import services.CommentService;

public class Main {

	public static void main(String[] args) {
		var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
//		var repository = new DBCommentRepository();
//		var notificationProxy = new EmailCommentNotificationProxy();
//		var service = new CommentService(repository, notificationProxy);
		CommentService service = ctx.getBean(CommentService.class);
		
		var comment = new Comment();
		comment.setAuthor("개발고수");
		comment.setText("프로젝트는 정말 잘 될거야!");
		service.publishComment(comment);
	}

}

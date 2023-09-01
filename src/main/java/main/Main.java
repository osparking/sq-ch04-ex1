package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {

	public static void main(String[] args) {
		var repository = new DBCommentRepository();
		var notificationProxy = new EmailCommentNotificationProxy();
		var service = new CommentService(repository, notificationProxy);
		var comment = new Comment();
		comment.setAuthor("개발자");
		comment.setText("프로젝트는 잘 될거야!");
		service.publishComment(comment);
	}

}

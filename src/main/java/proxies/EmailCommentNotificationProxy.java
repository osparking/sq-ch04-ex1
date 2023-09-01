package proxies;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Comment being notified by email: " + comment.getText());
	}

}

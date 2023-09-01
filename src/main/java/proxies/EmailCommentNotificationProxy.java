package proxies;

import model.Comment;
import utility.InOut;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		InOut.console.println("Comment being notified by email: " + comment.getText());
	}

}

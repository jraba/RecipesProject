package entity;

public class Comment {
//Jess
	private int comment_id;
	private String comment;

	public Comment(int commentId, String comment) {
		this.comment_id = commentId;
		this.comment = comment;
	}

	public int getCommentId() {
		return comment_id;

	}

	public String getComment() {
		return comment;

	}

	@Override
	public String toString() {
		return "Comment [commentId =" + comment_id + ", Comment =" + comment + "]";

	}
}

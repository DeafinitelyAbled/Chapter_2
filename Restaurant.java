public class Restaurant extends Business {
    private int rating;

    public void setRating(int userRating) {
        rating = userRating;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +
                "\n Rating:" + rating;
    }
}
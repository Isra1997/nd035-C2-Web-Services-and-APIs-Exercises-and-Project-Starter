package com.udacity.pricing.domain.price;

import java.util.List;

public class Prices {
    private List<Price> posts;

    public List<Price> getPosts() {
        return posts;
    }

    public void setPosts(List<Price> posts) {
        this.posts = posts;
    }
}

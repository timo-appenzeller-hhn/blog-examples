package de.hs_heilbronn.swe1.blog;

import java.time.LocalDateTime;

public class Tag {

    private LocalDateTime createdDate;
    private String name;

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}

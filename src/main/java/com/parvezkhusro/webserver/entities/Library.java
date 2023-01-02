package com.parvezkhusro.webserver.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "foo_library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lib_id;
    private int status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public long getLib_id() {
        return lib_id;
    }

    public void setLib_id(long lib_id) {
        this.lib_id = lib_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Library{" +
                "lib_id=" + lib_id +
                ", status=" + status +
                ", user=" + user +
                '}';
    }
}

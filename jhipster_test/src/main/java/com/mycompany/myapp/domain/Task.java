package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Task.
 */
@Entity
@Table(name = "task")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(min = 1, max = 2000)
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @Column(name = "title", length = 2000, nullable = false, unique = true)
    private String title;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    @Column(name = "text", nullable = false)
    private String text;

    @Column(name = "done")
    private Boolean done;

    @ManyToOne(optional = false)
    @NotNull
    private User user_task;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Task id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public Task title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public Task text(String text) {
        this.setText(text);
        return this;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getDone() {
        return this.done;
    }

    public Task done(Boolean done) {
        this.setDone(done);
        return this;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public User getUser_task() {
        return this.user_task;
    }

    public void setUser_task(User user) {
        this.user_task = user;
    }

    public Task user_task(User user) {
        this.setUser_task(user);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }
        return id != null && id.equals(((Task) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Task{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", text='" + getText() + "'" +
            ", done='" + getDone() + "'" +
            "}";
    }
}

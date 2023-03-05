package com.mycompany.myapp.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.api.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.Task} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.TaskResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /tasks?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TaskCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter title;

    private StringFilter text;

    private BooleanFilter done;

    private LongFilter user_taskId;

    private Boolean distinct;

    public TaskCriteria() {}

    public TaskCriteria(TaskCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.title = other.title == null ? null : other.title.copy();
        this.text = other.text == null ? null : other.text.copy();
        this.done = other.done == null ? null : other.done.copy();
        this.user_taskId = other.user_taskId == null ? null : other.user_taskId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public TaskCriteria copy() {
        return new TaskCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getTitle() {
        return title;
    }

    public StringFilter title() {
        if (title == null) {
            title = new StringFilter();
        }
        return title;
    }

    public void setTitle(StringFilter title) {
        this.title = title;
    }

    public StringFilter getText() {
        return text;
    }

    public StringFilter text() {
        if (text == null) {
            text = new StringFilter();
        }
        return text;
    }

    public void setText(StringFilter text) {
        this.text = text;
    }

    public BooleanFilter getDone() {
        return done;
    }

    public BooleanFilter done() {
        if (done == null) {
            done = new BooleanFilter();
        }
        return done;
    }

    public void setDone(BooleanFilter done) {
        this.done = done;
    }

    public LongFilter getUser_taskId() {
        return user_taskId;
    }

    public LongFilter user_taskId() {
        if (user_taskId == null) {
            user_taskId = new LongFilter();
        }
        return user_taskId;
    }

    public void setUser_taskId(LongFilter user_taskId) {
        this.user_taskId = user_taskId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final TaskCriteria that = (TaskCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(title, that.title) &&
            Objects.equals(text, that.text) &&
            Objects.equals(done, that.done) &&
            Objects.equals(user_taskId, that.user_taskId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, done, user_taskId, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TaskCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (title != null ? "title=" + title + ", " : "") +
            (text != null ? "text=" + text + ", " : "") +
            (done != null ? "done=" + done + ", " : "") +
            (user_taskId != null ? "user_taskId=" + user_taskId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}

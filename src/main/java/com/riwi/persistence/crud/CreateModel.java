package com.riwi.persistence.crud;

public interface CreateModel<Entity> {
    Entity create(Entity request);
}

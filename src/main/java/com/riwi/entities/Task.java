package com.riwi.entities;

import com.riwi.utils.enums.StatusTask;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private String description;
    private StatusTask status;
    private LocalDate dueDate;
    private int board_id;
    private int task_id;

}

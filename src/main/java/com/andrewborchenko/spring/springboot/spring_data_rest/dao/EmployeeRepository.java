package com.andrewborchenko.spring.springboot.spring_data_rest.dao;




import com.andrewborchenko.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//ранее использованный класс EmployeeDAO
// JpaRepository<Employee - с этим entity работает БД, Integer - тип primary key у этого entity>
// JpaRepository предоставляет все CRUD операции для работы с БД автоматически

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // также можно прописать любой свой кастомный метод и соблюдая правила имени JPA
    // почти всегда подберут встроенный метод исходя из запроса
    //здесь работает spring data REST
    // он копирует название класса EmployeeRepository далее берет первый дженерик JpaRepository (Employee)
    // на основе Employee создает все необходимые rest api их примеры в проекте spring_data_jpa класс myRestController
    // меняя Employee -> employees
    // адреса будет выдавать по bestPractice
}

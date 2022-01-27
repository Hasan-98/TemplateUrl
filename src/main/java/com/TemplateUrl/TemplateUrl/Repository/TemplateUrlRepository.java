/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TemplateUrl.TemplateUrl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TemplateUrl.TemplateUrl.Model.*;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kalsym
 */
@Repository
public interface TemplateUrlRepository extends JpaRepository<Template, Long> {

}

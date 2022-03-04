package com.charles.shop.admin.modular.product.repository;

import com.charles.shop.admin.modular.product.domain.entity.CommentReplay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommentReplyRepository extends JpaRepository<CommentReplay, Long>, JpaSpecificationExecutor<CommentReplay> {
}

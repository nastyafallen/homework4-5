package ru.hogwarts.school.homework45.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.hogwarts.school.homework45.model.Avatar;
import java.util.Optional;

@Repository
public interface AvatarRepository extends PagingAndSortingRepository<Avatar, Long> {
    Optional<Avatar> findAvatarByStudentId(Long studentId);
}

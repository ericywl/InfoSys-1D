INSERT INTO courses (id, name) VALUES
  ('50.001', 'Introduction to Information System & Programming'),
  ('50.002', 'Computation Structures'),
  ('50.004', 'Introduction to Algorithms')
ON CONFLICT (id)
  DO NOTHING;

INSERT INTO students (id, name, email, course1_id, course2_id, course3_id, course4_id) VALUES
  (1001111, 'Eric', 'eric@mymail.sutd.edu.sg', '50.001', '50.002', '50.004', NULL),
  (1002222, 'Thanh', 'thanh@mymail.sutd.edu.sg', '50.001', '50.002', '50.004', NULL),
  (1003333, 'Kok', 'kok@mymail.sutd.edu.sg', '50.001', '50.002', '50.004', NULL),
  (1002423, 'Wen Tat', 'wentat@mymail.sutd.edu.sg', '50.001', '50.002', '50.004', NULL),
  (1002523, 'Roshni', 'roshni@mymail.sutd.edu.sg', '50.001', '50.002', '50.004', NULL),
  (1002859, 'Ragini', 'ragini@mymail.sutd.edu.sg', '50.001', '50.002', '50.004', NULL)
ON CONFLICT (id)
  DO
  UPDATE SET
    course1_id = EXCLUDED.course1_id,
    course2_id = EXCLUDED.course2_id,
    course3_id = EXCLUDED.course3_id,
    course4_id = EXCLUDED.course4_id;

INSERT INTO professors (name, alias, email, office, course_id) VALUES
  ('Oka Kurniawan', 'OKA', 'oka_kurniawan@sutd.edu.sg', '1.502-27', '50.002'),
  ('Zhang Yue', 'ZY', 'yue_zhang@sutd.edu.sg', '1.702-34', '50.002'),
  ('Yuen Chau', 'YC', 'yuenchau@sutd.edu.sg', '3.301-07', '50.002'),
  ('Zhou Jianying', 'JY', 'jianying_zhou@sutd.edu.sg', '1.302-03', '50.002'),
  ('Norman Lee', 'NORMAN', 'norman_lee@sutd.edu.sg', '1.502-25', '50.001'),
  ('Jit Biswas', 'JIT', 'jit_biswas@sutd.edu.sg', '1.602-28', '50.001'),
  ('Ngai-Man Cheung', 'MAN', 'ngaiman_cheung@sutd.edu.sg', '1.502-17', '50.001'),
  ('Subhajit Datta', 'DATTA', 'subhajit_datta@sutd.edu.sg', '1.702-32', '50.004'),
  ('Simon Lui', 'SIMON', 'simon_lui@sutd.edu.sg', '1.502-18', '50.004'),
  ('Gemma Roig', 'GEMMA', 'gemma_roig@sutd.edu.sg', '1.702-33', '50.004')
ON CONFLICT (name)
  DO
  UPDATE SET
    alias     = EXCLUDED.alias,
    office    = EXCLUDED.office,
    course_id = EXCLUDED.course_id;

INSERT INTO bookings (professor_alias, start_time) VALUES
  ('ZY', make_timestamp(2017, 12, 5, 8, 0, 0)),
  ('OKA', make_timestamp(2017, 12, 5, 8, 30, 0)),
  ('MAN', make_timestamp(2017, 12, 5, 9, 0, 0)),
  ('DATTA', make_timestamp(2017, 12, 6, 13, 0, 0)),
  ('NORMAN', make_timestamp(2017, 12, 6, 16, 0, 0)),
  ('JIT', make_timestamp(2017, 12, 5, 15, 30, 0));



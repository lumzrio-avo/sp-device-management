CREATE DATABASE campus_db DEFAULT CHARSET utf8mb4;
USE campus_db;

CREATE TABLE device (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        name VARCHAR(50) NOT NULL,
                        type VARCHAR(30),
                        location VARCHAR(50),
                        status VARCHAR(20)
);

INSERT INTO device (name, type, location, status) VALUES

                                        ('激光打印机A', '打印设备', '行政楼201', '正常'),
                                                      ('投影仪B', '多媒体设备', '教学楼305', '维修中'),
                                                      ('交换机C', '网络设备', '机房101', '正常'),
                                                      ('监控摄像头D', '监控设备', '校门东侧', '正常'),
                                                      ('智慧黑板E', '教学设备', '教学楼208', '停用');


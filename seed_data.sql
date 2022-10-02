insert into bus(
  id, name, number, driver_id, route, 
  type, source, destination, arrival_time, 
  departure_time, total_seats, available_seats, 
  is_available, price
) 
values 
  (
    1, 'Volvo', 'DL-1L-AB-9332', 4, 'delhi->rajasthan->MP->mumbai', 
    'AC', 'delhi', 'Mumbai', '2022-10-04 10:34:09 AM', 
    , 35, 25, true, 830
  ), 
  (
    2, 'Tata', 'DL-1L-AB-4332', 10, 'delhi->rajasthan->MP->mumbai', 
    'AC', 'delhi', 'Mumbai', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    3, 'Mahindra', 'DL-1L-AB-7332', 11, 
    'delhi->rajasthan->MP->mumbai', 
    'AC', 'delhi', 'Mumbai', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    4, 'Volvo', 'MH-1L-YB-3422', 12, 'Mumbai->rajasthan->Delhi', 
    'Non-AC', 'Mumbai', 'delhi', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    5, 'Volvo', 'MH-1L-nB-5622', 13, 'Mumbai->rajasthan->Delhi', 
    'Non-AC', 'Mumbai', 'delhi', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    6, 'Volvo', 'MH-1L-lB-2322', 14, 'Mumbai->rajasthan->Delhi', 
    'Non-AC', 'Mumbai', 'delhi', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    7, 'TATA', 'BN-1L-GB-9162', 3, 'Benguluru->Mumbai->MP->Rajsthan', 
    'AC', 'Benguluru', 'Rajsthan', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    8, 'TATA', 'BN-1L-GB-9762', 15, 'Benguluru->Mumbai->MP->Rajsthan', 
    'AC', 'Benguluru', 'Rajsthan', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    9, 'TATA', 'BN-1L-GB-9962', 16, 'Benguluru->Mumbai->MP->Rajsthan', 
    'AC', 'Benguluru', 'Rajsthan', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    10, 'BMW', 'KK-1L-MB-1112', 5, 'kolkata->Bihar->MP->haryana', 
    'Non-AC', 'kolkata', 'haryana', '2022-10-04 10:34:09', 
    '2022-10-05 10:34:09', 35, 25, true, 
    830
  ), 
  (
    11, 
    BMW ',' GJ - 1L - CB - 4442 ',6,' Gujrat -> rajasthan -> haryana -> kashmir ',' AC ',' Gujrat ',' kashmir ',' 2022 - 10 - 04 10 : 34 : 09 ',' 2022 - 10 - 05 10 : 34 : 09 ',35,25,true,830);



insert into 
       user (id,name,email,password,user_type,phone,address)
values
(1,' Munna Gupta ',' MunnaGupta@gmail.com ',' admin ',' admin ',' 9834778824 ',' delhi '),
(2,' shyam ',' shyam@gmail.com ',null,' driver ',' 9832378824 ',' Mumbai '),
(3,' amit ',' amit@gmail.com ',null,' driver ',' 9964778824 ',' delhi '),
(4,' ankit ',' ankit@gmail.com ',null,' driver ',' 9834767824 ',' Haryana '),
(5,' rohit ',' rohit@gmail.com ',null,' driver ',' 9238778824 ',' benguluru '),
(6,' naresh ',' naresh@gmail.com ',null,' driver ',' 9834778874 ',' HP '),
(7,' sumit ',' sumit@gmail.com ',null,' customer ',' 9834771824 ',' Haryana '),
(8,' abhishek ',' abhishek@gmail.com ',null,' customer ',' 3834778824 ',' Kolkata '),
(9,' harshit ',' harshit@gmail.com ',null,' customer ',' 9834778845 ',' chennai '),
(10,' yogesh ',' yogesh@gmail.com ',null,' driver ',' 981238874 ',' HP '),
(11,' avinash ',' avinash@gmail.com ',null,' driver ',' 967778874 ',' delhi '),
(12,' narendra ',' narendra@gmail.com ',null,' driver ',' 233478874 ',' mumbai '),
(13,' amit ',' amit@gmail.com ',null,' driver ',' 983472345 ',' rajasthan '),
(14,' virat ',' virat@gmail.com ',null,' driver ',' 956472345 ',' tamilnadu '),
(15,' rishab ',' rishab@gmail.com ',null,' driver ',' 983433455 ',' odisa '),
(16,' dinesh ',' dinesh@gmail.com ',null,' driver ',' 9833453455 ',' meghalya '),
(17,' kapil ',' kapil@gmail.com ',null,' driver ',' 9834345345 ',' surat ');

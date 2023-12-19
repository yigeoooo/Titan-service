package com.titan.constant;

/**
 * @author yigeoooo
 * @since date 2023/12/19
 */
public class CommonConstant {


    public static class Root {

        /**
         * 管理员常量
         */
        public final static String ROOT_ID = "root_id";

        /**
         * 管理员密码常量
         */
        public final static String PASSWORD = "password";

    }

    public static class Department {
        /**
         * 科室编码常量
         */
        public final static String DEPARTMENT_CODE = "department_code";
        /**
         * 科室名常量
         */
        public final static String DEPARTMENT_NAME = "department_name";
        /**
         * 主管医生常量
         */
        public final static String MANAGER = "manager";

    }


    public static class Nurse {

        /**
         * 護士名常量
         */
        public final static String NURSE_NAME = "nurse_name";

        /**
         * 部门常量
         */
        public final static String DEPARTMENT = "department";

    }


    public static class Ward {

        /**
         * 部门常量
         */
        public final static String DEPARTMENT = "department";

        /**
         * 主管护士常量
         */
        public final static String MANAGER = "manager";

    }


    public static class Bed {

        /**
         * 部门常量
         */
        public final static String DEPARTMENT = "department";

        /**
         * 主管护士名常量
         */
        public final static String MANAGER_NURSE = "manager_nurse";

    }

    public static class Doctor {

        /**
         * 医生名常量
         */
        public final static String DOCTOR_NAME = "doctor_name";

        /**
         * 部门常量
         */
        public final static String DEPARTMENT = "department";

        /**
         * 医生性别常量
         */
        public final static String DOCTOR_GENDER = "doctor_gender";


    }

}

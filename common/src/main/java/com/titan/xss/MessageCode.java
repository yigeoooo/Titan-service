package com.titan.xss;


/**
 * @author wangq
 */
public class MessageCode {

    public static class CommonMessage {
        /**
         * 處理成功!
         */
        public static final String ERROR = "ERROR";
        /****/
        public static final String ACCOUNT_DISABLE_ERROR = "ACCOUNT_DISABLE_ERROR";
        /**
         * 未經授權!
         */
        public static final String UNAUTHORIZED = "UNAUTHORIZED";
        /**
         * 不存在!
         */
        public static final String NOT_FOUND = "NOT_FOUND";
        /**
         * 參數錯誤!
         */
        public static final String PARAM_ERROR = "PARAM_ERROR";
        /**
         * 參數為空!
         */
        public static final String PARAM_EMPTY = "PARAM_EMPTY";
        /**
         * 數據已存在!
         */
        public static final String DATA_EXISTS = "DATA_EXISTS";
        /**
         * 數據已存在!
         */
        public static final String TOKEN_CREATE_ERROR = "TOKEN_CREATE_ERROR";

        public static final String DYNAMIC_ERROR = "DYNAMIC_ERROR";


    }


    /**
     * 網路連線超時，請重試
     */
    public static String NETWORK_CONNECT_TIME_OUT = "NETWORK_CONNECT_TIME_OUT";
    /**
     * 當前賬戶沒有郵箱
     */
    public static final String EMAIL_EXIST_ERROR = "EMAIL_EXIST_ERROR";
    /**
     * 當前賬戶沒有手機號碼
     */
    public static final String PHONE_EXIST_ERROR = "PHONE_EXIST_ERROR";
    /**
     * 發送文件手機號錯誤
     */
    public static final String SEND_FAIL_PHONE_ERROR = "SEND_FAIL_PHONE_ERROR";
    /**
     * 發送驗證碼失敗
     */
    public static final String SEND_VERIFY_CODE_ERROR = "SEND_VERIFY_CODE_ERROR";

    /**
     * 請選擇上傳的文件
     */
    public static final String FILE_UPLOAD_FILE_NOT_EXISTS = "FILE_UPLOAD_FILE_NOT_EXISTS";

    /*** 文件上傳失敗,文件僅支持.JPG.PNG.JPEG.PDF格式*/
    public static final String FILE_UPLOAD_FORMAT_ERROR = "FILE_UPLOAD_FORMAT_ERROR";

    /**
     * 文件上傳失敗
     */
    public static final String FILE_UPLOAD_FAIL = "FILE_UPLOAD_FAIL";

    /**
     * 簡訊驗證碼發送失敗返回code
     */

    public static class LoginMessage {
        /*** 驗證碼錯誤，請重新輸入*/
        public static final String VERIFICATION_CODE_PARAM_ERROR = "VERIFICATION_CODE_PARAM_ERROR";
        /*** 帳號或密碼錯誤，請重新輸入*/
        public static final String ACCOUNT_PASSWORD_PARAM_ERROR = "ACCOUNT_PASSWORD_PARAM_ERROR";
        /*** 當前帳號已被鎖定，請聯係管理員*/
        public static final String ACCOUNT_LOCKING_ERROR = "ACCOUNT_LOCKING_ERROR";
        /*** 當前登錄帳號重複，請確認*/
        public static final String LOGIN_ACCOUNT_DUPLICATE = "LOGIN_ACCOUNT_DUPLICATE";
        /*** 當前用戶標識不存在，請確認*/
        public static final String TOKEN_NOT_EXIST_ERROR = "TOKEN_NOT_EXIST_ERROR";
        /*** 登入驗證超時，請重新登入*/
        public static final String LOGIN_TIME_OUT_ERROR = "LOGIN_TIME_OUT_ERROR";
        /*** 當前用戶信息修改失敗*/
        public static final String SYS_USER_UPDATE_ERROR = "SYS_USER_UPDATE_ERROR";
        /*** 請至少選擇一個所屬部門*/
        public static final String SYS_USER_DEPT_NOT_CHOOSE_ERROR = "SYS_USER_DEPT_NOT_CHOOSE_ERROR";
    }

    public static class AuditMasterMessage {
        /*** 當前訊息已存在相關審核事件，無法進行相關操作，請確認*/
        public static final String AUDIT_DELETE = "AUDIT_DELETE";
        /*** 未傳遞審核狀態ID*/
        public static final String NO_HAVE_AUDIT_STATE_ID = "NO_HAVE_AUDIT_STATE_ID";
        /*** 審核狀態表沒有此條數據*/
        public static final String NO_HAVE_AUDIT_STATE_DATA = "NO_HAVE_AUDIT_STATE_DATA";
        /*** 審核狀態信息已刪除*/
        public static final String AUDIT_STATE_DATA_DELETE = "AUDIT_STATE_DATA_DELETE";
        /*** 數據庫不存在此審核主檔ID*/
        public static final String NO_HAVE_AUDIT_MASTER_ID = "NO_HAVE_AUDIT_MASTER_ID";
        /*** 此審核數據已被刪除*/
        public static final String THIS_DATA_DELETE = "THIS_DATA_DELETE";
        /*** 未查詢到工作分派信息*/
        public static final String NO_HAVE_CASE_ASSIGNMENT_DATA = "NO_HAVE_CASE_ASSIGNMENT_DATA";
        /*** 工作分派信息已刪除*/
        public static final String CASE_ASSIGNMENT_DATA_DELETE = "CASE_ASSIGNMENT_DATA_DELETE";
        /*** 數據庫不存在此審核主檔ID*/
        public static final String DATABASE_NO_HAVE_AUDIT_STATE_ID = "DATABASE_NO_HAVE_AUDIT_STATE_ID";
        /*** ID為空*/
        public static final String NOT_HAVE_ID = "NOT_HAVE_ID";
        /*** 審核主檔信息更新失敗*/
        public static final String AUDIT_MASTER_UPDATE_ERROR = "AUDIT_MASTER_UPDATE_ERROR";
        /*** 審核狀態信息更新失敗*/
        public static final String AUDIT_STATE_UPDATE_ERROR = "AUDIT_STATE_UPDATE_ERROR";
        /*** 工作分派信息更新失敗*/
        public static final String CASE_ASSIGNMENT_DATA_UPDATE_ERROR = "CASE_ASSIGNMENT_DATA_UPDATE_ERROR";
        /*** 審核通過履歷信息添加失敗*/
        public static final String AUDIT_YES_CV_SAVE_ERROR = "AUDIT_YES_CV_SAVE_ERROR";
        /*** 未查詢到相應的案件信息*/
        public static final String NOT_HAVE_CASE_DATA = "NOT_HAVE_CASE_DATA";
        /*** 案件信息已被刪除*/
        public static final String CASE_DATA_DELETE = "CASE_DATA_DELETE";
        /*** 審核拒絕履歷信息添加失敗*/
        public static final String AUDIT_NO_CV_SAVE_ERROR = "AUDIT_NO_CV_SAVE_ERROR";
        /*** 商戶平臺商戶狀態信息修改失敗*/
        public static final String MERCHANT_PLATFORM_MERCHANT_STATE_UPDATE_ERROR = "MERCHANT_PLATFORM_MERCHANT_STATE_UPDATE_ERROR";
        /*** 審核補件履歷信息添加失敗*/
        public static final String AUDIT_PATCH_CV_SAVE_ERROR = "AUDIT_PATCH_CV_SAVE_ERROR";
        /*** 未查詢到相應的審核主檔數據*/
        public static final String AUDIT_MASTER_GET_ERROR = "AUDIT_MASTER_GET_ERROR";

    }




    public static class AuditPermissionSettingMessage {
        /*** 商戶银行卡綁定失敗*/
        public static final String MERCHANT_BANK_BINDING_ERROR = "MERCHANT_BANK_BINDING_ERROR";
        /*** 保存審核權限設定表失敗*/
        public static final String AUDIT_PERMISSION_SETTING_SAVE_ERROR = "AUDIT_PERMISSION_SETTING_SAVE_ERROR";
    }




    public static class AuditSettingMasterMessage {
        /*** 保存失敗*/
        public static final String SAVE_ERROR = "SAVE_ERROR";
        /*** 修改全部失敗*/
        public static final String UPDATE_ALL_ERROR = "UPDATE_ALL_ERROR";
        /*** 修改狀態失敗*/
        public static final String UPDATE_STATE_ERROR = "UPDATE_STATE_ERROR";
        /*** 刪除失敗*/
        public static final String DELETE_ERROR = "DELETE_ERROR";
        /*** 審核設定詳細數據查詢失敗*/
        public static final String AUDIT_SET_DETAILED_DATA_SELECT_ERROR = "AUDIT_SET_DETAILED_DATA_SELECT_ERROR";
        /*** 案件主分類為空*/
        public static final String AUDIT_DEMAND_TYPE_EMPTY = "AUDIT_DEMAND_TYPE_EMPTY";
        /*** 傳入審核編碼為空*/
        public static final String AUDIT_CODE_EMPTY = "AUDIT_CODE_EMPTY";
        /*** 傳入審核事件名稱為空*/
        public static final String AUDIT_NAME_EMPTY = "AUDIT_NAME_EMPTY";
        /*** 傳入審核流程類型為空*/
        public static final String AUDIT_PROCESS_TYPE_EMPTY = "AUDIT_PROCESS_TYPE_EMPTY";
        /*** 傳入開啓狀態為空*/
        public static final String STATUS_EMPTY = "STATUS_EMPTY";
        /*** 傳入審核設定ID為空*/
        public static final String STETTING_ID_EMPTY = "STETTING_ID_EMPTY";
        /*** 沒有對應數據ID或已被刪除*/
        public static final String NOT_HAVE_STETTING_ID_OR_DELETED = "NOT_HAVE_STETTING_ID_OR_DELETED";
        /*** 沒有對應數據ID*/
        public static final String NOT_HAVE_STETTING_ID = "NOT_HAVE_STETTING_ID";
        /*** 已被刪除*/
        public static final String ALREADY_DELETED = "ALREADY_DELETED";
        /*** 傳入審核編碼重複*/
        public static final String AUDIT_CODE_REPEAT = "AUDIT_CODE_REPEAT";
    }

    public static class AuditMA0001Message {
        /*** 未查詢到商戶申請信息*/
        public static final String NOT_FIND_MERCHANT_DATA = "NOT_FIND_MERCHANT_DATA";
        /*** 商戶申請數據更新失敗*/
        public static final String MERCHANT_APPLY_FOR_UPDATE_ERROR = "MERCHANT_APPLY_FOR_UPDATE_ERROR";
        /*** 審核主檔數據添加失敗*/
        public static final String AUDIT_MASTER_SAVE_ERROR = "AUDIT_MASTER_SAVE_ERROR";
        /*** 新建案件信息履歷信息添加失敗*/
        public static final String NEW_CASE_INFORMATION_CV_SAVE_ERROR = "NEW_CASE_INFORMATION_CV_SAVE_ERROR";
        /*** 人員審核狀態數據添加失敗*/
        public static final String PERSONNEL_AUDIT_STATE_SAVE_ERROR = "PERSONNEL_AUDIT_STATE_SAVE_ERROR";
        /*** 工作分派信息數據添加失敗*/
        public static final String CASE_ASSIGNMENT_DATA_SAVE_ERROR = "CASE_ASSIGNMENT_DATA_SAVE_ERROR";
        /*** 新建工作信息履歷信息添加失敗*/
        public static final String NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR = "NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR";
    }

    public static class AuditMA0002Message {
        /*** 未查詢到商戶主檔信息*/
        public static final String NOT_FIND_MERCHANT_MASTER_DATA = "NOT_FIND_MERCHANT_MASTER_DATA";
        /*** 新建案件信息履歷信息添加失敗*/
        public static final String NEW_CASE_CASE_CV_DATA_SAVE_ERROR = "NEW_CASE_CASE_CV_DATA_SAVE_ERROR";
    }

    public static class AuditLC0003Message {
        /*** 新建案件信息履歷信息添加失敗*/
        public static final String NEW_CASE_CASE_CV_DATA_SAVE_ERROR = "NEW_CASE_CASE_CV_DATA_SAVE_ERROR";
        /*** 人員審核狀態數據添加失敗*/
        public static final String PERSONNEL_AUDIT_STATE_SAVE_ERROR = "PERSONNEL_AUDIT_STATE_SAVE_ERROR";
        /*** 工作分派信息數據添加失敗*/
        public static final String CASE_ASSIGNMENT_DATA_SAVE_ERROR = "CASE_ASSIGNMENT_DATA_SAVE_ERROR";
        /*** 新建工作信息履歷信息添加失敗*/
        public static final String NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR = "NEW_CASE_ASSIGNMENT_CV_DATA_SAVE_ERROR";
    }


    public static class BankMessage {
        /*** 傳入的銀行ID爲空*/
        public static final String BANK_ID_EMPTY = "BANK_ID_EMPTY";
        /*** 通過傳入的銀行ID未在銀行分行信息表中獲取對象數據*/
        public static final String BRANCH_ENTITY_LIST_EMPTY = "BRANCH_ENTITY_LIST_EMPTY";

    public static class CommonDataMessage {

    public static class CreditInstallmentSettingMessage {
        /*** 信用卡分期設定保存失敗*/
        public static final String CREDIT_INSTALLMENT_SETTING_SAVE_ERROR = "CREDIT_INSTALLMENT_SETTING_SAVE_ERROR";
        /*** 請輸入銀行名稱*/
        public static final String CREDIT_INSTALLMENT_SETTING_BANK_ID_EMPTY = "CREDIT_INSTALLMENT_SETTING_BANK_ID_EMPTY";
        /*** 請輸入相關内容后再進行保存*/
        public static final String DATA_EMPTY = "DATA_EMPTY";
        /*** 傳入的商戶ID爲空*/
        public static final String CREDIT_INSTALLMENT_SETTING_MERCHANT_ID_EMPTY = "CREDIT_INSTALLMENT_SETTING_MERCHANT_ID_EMPTY";
        /*** 傳入的銀行ID爲空*/
        public static final String INCOMING_BANK_ID_EMPTY = "INCOMING_BANK_ID_EMPTY";
        /*** 新增銀行失敗*/
        public static final String BANK_SAVE_ERROR = "BANK_SAVE_ERROR";
        /*** 此銀行已經保存*/
        public static final String BANK_ALREADY_SAVE_ERROR = "BANK_ALREADY_SAVE_ERROR";
        /**
         * 最低手續費不能大於最高手續費
         */
        public static final String MIN_BIG_TO_MAX = "MIN_BIG_TO_MAX";

    public static class CommonResourceMessage {
        /*** 上傳的文件大小不能超過10MB*/
        public static final String UPLOAD_PHOTO_MEMORY_MUCH = "UPLOAD_PHOTO_MEMORY_MUCH";
        /*** 文件為空*/
        public static final String FILE_EMPTY = "FILE_EMPTY";
        /*** 刪除文件失敗*/
        public static final String DELETE_FILE_ERROR = "DELETE_FILE_ERROR";
        /*** 資源ID為空*/
        public static final String RESOURCES_ID_EMPTY = "RESOURCES_ID_EMPTY";
        /*** 此資源已刪除*/
        public static final String RESOURCES_DELETE = "RESOURCES_DELETE";
        /*** 該文件格式錯誤*/
        public static final String FILE_FORMAT_ERROR = "FILE_FORMAT_ERROR";

    }

    public static class CommonSysCodeMessage {
        /*** 未查詢到對應的系統語言内容，請確認，pcItemId=*/
        public static final String NOT_HAVE_SYS_LANGUAGE = "NOT_HAVE_SYS_LANGUAGE";
        /*** 未查詢到對應的系統項目内容，請確認，itemKey=*/
        public static final String NOT_HAVE_SYS_PROJECT_CONTENT = "NOT_HAVE_SYS_PROJECT_CONTENT";
        /*** 未查詢到對應的系統碼表内容，請確認，type=*/
        public static final String NOT_HAVE_SYS_CLOCK_CONTENT = "NOT_HAVE_SYS_CLOCK_CONTENT";

    }

    public static class VerificationCodeMessage {
        /*** 發送登錄郵箱驗證碼失敗*/
        public static final String LOGIN_EMAIL_VALIDATION_FAILURE = "LOGIN_EMAIL_VALIDATION_FAILURE";
        /*** 發送手機登錄驗證碼失敗*/
        public static final String MOBILE_PHONE_VALIDATION_FAILURE = "MOBILE_PHONE_VALIDATION_FAILURE";

    }

    public static class CommonAgeMessage {
        /*** 生日在現在之前，真是難以置信*/
        public static final String BIRTHDAY_IS_BEFORE = "BIRTHDAY_IS_BEFORE";
    }

    public static class CaseAssignmentMessage {
        /*** 案件信息爲空*/
        public static final String CASE_INFORMATION_EMPTY = "CASE_INFORMATION_EMPTY";
        /*** 工作信息爲空*/
        public static final String WORK_INFORMATION_EMPTY = "WORK_INFORMATION_EMPTY";
        /*** 創建工作分派時，添加工作失敗*/
        public static final String WORK_SAVE_ERROR = "WORK_SAVE_ERROR";
        /*** 請輸入工作id*/
        public static final String WORK_ID_EMPTY = "WORK_ID_EMPTY";
        /*** 該工作不存在*/
        public static final String THIS_WORK_NOT_HAVE = "THIS_WORK_NOT_HAVE";
        /*** 更新工作狀態出錯，工作id：*/
        public static final String UPDATE_WORK_STATE_ERROR = "UPDATE_WORK_STATE_ERROR";
        /*** 請輸入案件id*/
        public static final String PLEASE_ENTER_CASE_ID = "PLEASE_ENTER_CASE_ID";
        /*** 請選擇工作狀態*/
        public static final String PLEASE_CHOOSE_WORK_STATE = "PLEASE_CHOOSE_WORK_STATE";
        /*** 請選擇權限設定*/
        public static final String PLEASE_CHOOSE_ACCESS = "PLEASE_CHOOSE_ACCESS";
        /*** 父id不存在*/
        public static final String FATHER_ID_NOT = "FATHER_ID_NOT";

    }

    public static class CaseCommunicationRecordMessage {
        /*** 請選擇發生時間*/
        public static final String CHOOSE_HAPPEN_TIME = "CHOOSE_HAPPEN_TIME";
        /*** 案件溝通記錄id為空*/
        public static final String CASE_COMMUNICATION_RECORD_ID_EMPTY = "CASE_COMMUNICATION_RECORD_ID_EMPTY";
        /*** 處理方式為空*/
        public static final String TREATMENT_METHOD_EMPTY = "TREATMENT_METHOD_EMPTY";
        /*** 客服帳號類型為空*/
        public static final String SERVICE_ACCOUNT_TYPE_EMPTY = "SERVICE_ACCOUNT_TYPE_EMPTY";
        /*** 客服帳號為空*/
        public static final String SERVICE_ACCOUNT_EMPTY = "SERVICE_ACCOUNT_EMPTY";
        /*** 護膚內容、客服反饋、備註至少需填寫一項內容*/
        public static final String CONTENT_MISSING = "CONTENT_MISSING";
        /*** 回復內容字數超過規定限制*/
        public static final String REPLY_CONTENT_TOO_LONG = "REPLY_CONTENT_TOO_LONG";
        /*** 客戶反饋字數超過規定限制*/
        public static final String DIGITAL_TOO_LONG = "DIGITAL_TOO_LONG";
        /*** 備註字數超過規定限制*/
        public static final String NOTE_DIGITAL_TOO_LONG = "NOTE_DIGITAL_TOO_LONG";

    }

    public static class CasesMessage {
        /*** 修改案件信息失败*/
        public static final String UPDATE_CASE_INFORMATION_ERROR = "UPDATE_CASE_INFORMATION_ERROR";
        /*** 修改案件信息的備注失败*/
        public static final String UPDATE_CASE_INFORMATION_NOTE_ERROR = "UPDATE_CASE_INFORMATION_NOTE_ERROR";
        /*** 案件ID為空*/
        public static final String CASE_ID_EMPTY = "CASE_ID_EMPTY";
        /*** 案件ID不存在*/
        public static final String NOT_HAVE_CASE_ID = "NOT_HAVE_CASE_ID";
        /*** 履歷添加失敗*/
        public static final String CV_SAVE_ERROR = "CV_SAVE_ERROR";
        /*** 未查詢到相應數據*/
        public static final String NOT_HAVE_DATA = "NOT_HAVE_DATA";
        /*** 此數據已被刪除*/
        public static final String THIS_DATA_NOT_HAVE = "THIS_DATA_NOT_HAVE";
        /*** 更新案件狀態出錯，案件ID：*/
        public static final String UPDATE_CASE_STATE_ERROR = "UPDATE_CASE_STATE_ERROR";
        /*** 案件主旨為空*/
        public static final String CASE_KEYNOTE_EMPTY = "CASE_KEYNOTE_EMPTY";
        /*** 回報通道為空*/
        public static final String RETURN_CHANNEL_EMPTY = "RETURN_CHANNEL_EMPTY";
        /*** 問題回報時間為空*/
        public static final String PROBLEM_RETURN_TIME_EMPTY = "PROBLEM_RETURN_TIME_EMPTY";
        /*** 回報人名字爲空*/
        public static final String RETURN_NAME_EMPTY = "RETURN_NAME_EMPTY";
        /*** 回報人身分爲空*/
        public static final String RETURN_IDENTITY_EMPTY = "RETURN_IDENTITY_EMPTY";
        /*** 回報人email聯係方式爲空*/
        public static final String CONTACT_EMAIL_EMPTY = "CONTACT_EMAIL_EMPTY";
        /*** 客戶名稱描述字數超過規定限制*/
        public static final String CUSTOMER_NAME_WORD_TOO_LONG = "CUSTOMER_NAME_WORD_TOO_LONG";
        /*** 客戶聯係方式帳號字數超過規定限制*/
        public static final String CUSTOMER_CONTACT_NUMBER_WORD_TOO_LONG = "CUSTOMER_CONTACT_NUMBER_WORD_TOO_LONG";
        /*** 問題類型為空*/
        public static final String QUESTIONS_TYPE_EMPTY = "QUESTIONS_TYPE_EMPTY";
        /*** 發生時間爲空*/
        public static final String HAPPEN_TIME_EMPTY = "HAPPEN_TIME_EMPTY";
        /*** 問題描述爲空*/
        public static final String QUESTIONS_DESCRIBE_EMPTY = "QUESTIONS_DESCRIBE_EMPTY";
        /*** 問題描述字數超過規定限制*/
        public static final String QUESTIONS_DESCRIBE_WORD_TOO_LONG = "QUESTIONS_DESCRIBE_WORD_TOO_LONG";
        /*** 未查詢到相應的案件信息*/
        public static final String CASES_GET_ERROR = "CASES_GET_ERROR";
        /*** 案件信息已被刪除*/
        public static final String CASES_DELETED_ERROR = "CASES_DELETED_ERROR";
    }

    public static class CrmQuestionMessage {
        /*** 新增問題失敗*/
        public static final String NEW_PROBLEM_ERROR = "NEW_PROBLEM_ERROR";
        /*** 保存問題失敗*/
        public static final String SAVE_PROBLEM_ERROR = "SAVE_PROBLEM_ERROR";
        /*** 删除问题失敗*/
        public static final String DELETE_PROBLEM_ERROR = "DELETE_PROBLEM_ERROR";
        /*** 删除失败！需要先删除该主问题下的副问题！*/
        public static final String DELETE_DATA_ERROR = "DELETE_DATA_ERROR";
        /*** 輸入的案件問題編碼為空*/
        public static final String QUESTION_CODE_EMPTY = "QUESTION_CODE_EMPTY";
    }

    public static class CrmAuditCheckOverruleMessage {
        /*** 未查詢審核主檔信息*/
        public static final String NOT_HAVE_REVIEW_MASTER = "NOT_HAVE_REVIEW_MASTER";
        /*** 審核主檔信息已刪除*/
        public static final String REVIEW_MASTER_DELETE = "REVIEW_MASTER_DELETE";
        /*** 審核主檔ID不能為空，請確認*/
        public static final String AUDIT_MASTER_ID_PARAM_ERROR = "AUDIT_MASTER_ID_PARAM_ERROR";
        /*** 審核編碼信息錯誤，請確認*/
        public static final String AUDIT_CODE_ERROR = "AUDIT_CODE_ERROR";
        /*** 未查詢到審核設定信息，請確認*/
        public static final String AUDIT_SETTING_GET_ERROR = "AUDIT_SETTING_GET_ERROR";
        /*** 審核設定信息已被刪除，請確認*/
        public static final String AUDIT_SETTING_DELETED_ERROR = "AUDIT_SETTING_DELETED_ERROR";
        /*** 審核設定信息未設置審核編碼，請確認*/
        public static final String AUDIT_CODE_LACK_ERROR = "AUDIT_CODE_LACK_ERROR";

        public static class SysLanguageMessage {
            /*** 沒有對應的系統語言項目，請確認*/
            public static final String SYS_LANGUAGE_CONTENTS_ITEM_NOT_EXIST_ERROR = "SYS_LANGUAGE_CONTENTS_ITEM_NOT_EXIST_ERROR";
            /*** 已有相同的系統語言項目，請確認*/
            public static final String SYS_LANGUAGE_CONTENTS_ITEM_EXIST_ERROR = "SYS_LANGUAGE_CONTENTS_ITEM_EXIST_ERROR";
            /*** 已有相同的系統語言内容，請確認*/
            public static final String SYS_LANGUAGE_CONTENTS_CONTENT_EXIST_ERROR = "SYS_LANGUAGE_CONTENTS_CONTENT_EXIST_ERROR";
            /*** 獲得的系統語言項目信息數量不符，請確認*/
            public static final String SYS_LANGUAGE_CONTENTS_ITEM_COUNT_ERROR = "SYS_LANGUAGE_CONTENTS_ITEM_COUNT_ERROR";
            /*** 未填寫功能代碼，請重新輸入*/
            public static final String FUNCTION_CODE_PARAM_ERROR = "FUNCTION_CODE_PARAM_ERROR";
            /*** 未填寫項目類型，請重新輸入*/
            public static final String ITEM_TYPE_PARAM_ERROR = "ITEM_TYPE_PARAM_ERROR";
            /*** 未填寫項目編號，請重新輸入*/
            public static final String ITEM_KEY_PARAM_ERROR = "ITEM_KEY_PARAM_ERROR";

        }

        public static class SysCodeMessage {
            /*** 系統碼表信息保存失敗，請確認*/
            public static final String SYS_CODE_SAVE_ERROR = "SYS_CODE_SAVE_ERROR";
            /*** 沒有對應的系統碼表信息，請確認*/
            public static final String SYS_CODE_NOT_EXIST_ERROR = "SYS_CODE_NOT_EXIST_ERROR";
            /*** 已有相同的系統碼表信息，請確認*/
            public static final String SYS_CODE_EXIST_ERROR = "SYS_CODE_EXIST_ERROR";
            /*** 系統碼表信息刪除失敗，請確認*/
            public static final String SYS_CODE_DELETE_ERROR = "SYS_CODE_DELETE_ERROR";
            /*** 已有相同的[詞彙編碼]存在，請確認*/
            public static final String SYS_CODE_CODE_EXIST_ERROR = "SYS_CODE_CODE_EXIST_ERROR";
            /*** 已有相同的[詞彙表KEY]存在，請確認*/
            public static final String SYS_CODE_TYPE_EXIST_ERROR = "SYS_CODE_TYPE_EXIST_ERROR";
            /*** 未填寫詞彙編碼，請重新輸入*/
            public static final String CODE_PARAM_ERROR = "CODE_PARAM_ERROR";
            /*** 詞彙編碼最大長度為10，請重新輸入*/
            public static final String CODE_LENGTH_PARAM_ERROR = "CODE_LENGTH_PARAM_ERROR";
            /*** 未填寫詞彙KEY，請重新輸入*/
            public static final String NAME_KEY_PARAM_ERROR = "NAME_KEY_PARAM_ERROR";
            /*** 詞彙KEY最大長度為100，請重新輸入*/
            public static final String NAME_KEY_LENGTH_PARAM_ERROR = "NAME_KEY_LENGTH_PARAM_ERROR";
            /*** 未填寫詞彙類型，請重新輸入*/
            public static final String TYPE_PARAM_ERROR = "TYPE_PARAM_ERROR";
            /*** 詞彙類型最大長度為100，請重新輸入*/
            public static final String TYPE_LENGTH_PARAM_ERROR = "TYPE_LENGTH_PARAM_ERROR";
            /*** 名稱最大長度為180，請重新輸入*/
            public static final String NAME_LENGTH_PARAM_ERROR = "NAME_LENGTH_PARAM_ERROR";
        }

        public static class MenuMessage {
            /*** 選單ID不能為空，請確認*/
            public static final String MENU_ID_PARAM_ERROR = "MENU_ID_PARAM_ERROR";
            /*** 選單編碼不能為空，請確認*/
            public static final String MENU_CODE_PARAM_ERROR = "MENU_CODE_PARAM_ERROR";
            /*** 選單類型不能為空，請確認*/
            public static final String MENU_TYPE_PARAM_ERROR = "MENU_TYPE_PARAM_ERROR";
            /*** 未填寫選單名稱，請重新輸入*/
            public static final String MENU_NAME_PARAM_ERROR = "MENU_NAME_PARAM_ERROR";
            /*** 未填寫上級選單，請重新輸入*/
            public static final String PARENT_ID_PARAM_ERROR = "PARENT_ID_PARAM_ERROR";
            /*** 未填寫選單URL，請重新輸入*/
            public static final String MENU_URL_PARAM_ERROR = "MENU_URL_PARAM_ERROR";
            /*** 無對應的選單信息，請確認*/
            public static final String SYS_MENU_NOT_EXIST_ERROR = "SYS_MENU_NOT_EXIST_ERROR";
            /*** 當前選單信息已被刪除*/
            public static final String SYS_MENU_REMOVE_ERROR = "SYS_MENU_REMOVE_ERROR";
            /*** 選單信息保存失敗，請確認*/
            public static final String SYS_MENU_SAVE_ERROR = "SYS_MENU_SAVE_ERROR";
            /*** 請先刪除子選單或按鈕*/
            public static final String DELETE_SUBMENU_OR_BUTTON_ERROR = "DELETE_SUBMENU_OR_BUTTON_ERROR";
            /*** 上級選單只能為目錄類型，請確認*/
            public static final String PARENT_DIRECTORY_TYPE_ERROR = "PARENT_DIRECTORY_TYPE_ERROR";
            /*** 上級選單只能為選單類型，請確認*/
            public static final String PARENT_MENU_TYPE_ERROR = "PARENT_MENU_TYPE_ERROR";
            /*** 菜單ID信息錯誤，請確認*/
            public static final String MENU_ID_ERROR = "MENU_ID_ERROR";
            /*** 未查詢到初始選單信息，請確認*/
            public static final String INITIAL_MENU_GET_ERROR = "INITIAL_MENU_GET_ERROR";
            /*** 未查詢到初始選單的父級信息，請確認*/
            public static final String PARENT_INITIAL_MENU_GET_ERROR = "PARENT_INITIAL_MENU_GET_ERROR";
            /*** 默認父菜單在商戶菜單中無對應信息，請確認*/
            public static final String PARENT_INITIAL_MENU_CORRESPOND_ERROR = "PARENT_INITIAL_MENU_CORRESPOND_ERROR";
            /*** 未通過選單KEY設置多語言信息，請確認*/
            public static final String CONTENT_LIST_PARAM_ERROR = "CONTENT_LIST_PARAM_ERROR";
        }

        public static class RoleMessage {
            /*** 角色ID不能為空，請確認*/
            public static final String ROLE_ID_PARAM_ERROR = "ROLE_ID_PARAM_ERROR";
            /*** 無對應的角色信息，請確認*/
            public static final String SYS_ROLE_NOT_EXIST_ERROR = "SYS_ROLE_NOT_EXIST_ERROR";
            /*** 當前角色信息已被刪除*/
            public static final String SYS_ROLE_REMOVE_ERROR = "SYS_ROLE_REMOVE_ERROR";
            /*** 保存角色信息失敗，請確認*/
            public static final String SYS_ROLE_SAVE_ERROR = "SYS_ROLE_SAVE_ERROR";
            /*** 刪除角色信息失敗，請確認*/
            public static final String SYS_ROLE_DELETE_ERROR = "SYS_ROLE_DELETE_ERROR";
            /*** 角色ID信息錯誤，請確認*/
            public static final String ROLE_ID_ERROR = "ROLE_ID_ERROR";
            /*** 未查詢到初始角色信息，請確認*/
            public static final String INITIAL_ROLE_GET_ERROR = "INITIAL_ROLE_GET_ERROR";
            /*** 初始角色ID不能為空，請確認*/
            public static final String INITIAL_ROLE_ID_PARAM_ERROR = "INITIAL_ROLE_ID_PARAM_ERROR";

        }

        public static class PaymentChannelMessage {

            public static class MerchantGroupPlatformRelationMessage {
                /*** 商戶通道組ID為空*/
                public static final String MERCHANT_GROUP_PLATFORM_RELATION_GROUP_ID_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_GROUP_ID_EMPTY";
                /*** 商戶組沒有對應的商戶組ID*/
                public static final String MERCHANT_GROUP_PLATFORM_RELATION_DEPLOY_GROUP_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_DEPLOY_GROUP_EMPTY";
                /*** 商戶組與支付通道關係沒有對應數據*/
                public static final String MERCHANT_GROUP_PLATFORM_RELATION_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_EMPTY";
                /*** 支付通道編號為空*/
                public static final String MERCHANT_GROUP_PLATFORM_RELATION_PAY_PLATFORM_ID_EMPTY = "MERCHANT_GROUP_PLATFORM_RELATION_PAY_PLATFORM_ID_EMPTY";
                /*** 商戶組與支付通道關係表保存異常*/
                public static final String SAVE_MERCHANT_GROUP_PLATFORM_RELATION_ERROR = "SAVE_MERCHANT_GROUP_PLATFORM_RELATION_ERROR";
                /*** 商戶組與支付通道關係表修改異常*/
                public static final String MERCHANT_GROUP_PLATFORM_RELATION_UPDATE_ERROR = "MERCHANT_GROUP_PLATFORM_RELATION_UPDATE_ERROR";
                /*** 商戶組可用通道訊息已存在，請確認*/
                public static final String MERCHANT_GROUP_PLATFORM_RELATION_ERROR = "MERCHANT_GROUP_PLATFORM_RELATION_ERROR";

            }

            public static class MerchantMessage {
                /*** 商戶組設定商戶保存失敗，請確認*/
                public static final String MERCHANT_GROUP_SAVE_ERROR = "MERCHANT_GROUP_SAVE_ERROR";
                /*** 當前商戶組下有商戶信息無法刪除，請確認*/
                public static final String MERCHANT_GROUP_HAVING_MERCHANT_DELETE_ERROR = "MERCHANT_GROUP_HAVING_MERCHANT_DELETE_ERROR";
                /*** 商戶組設定商戶刪除失敗，請確認*/
                public static final String MERCHANT_GROUP_DELETE_ERROR = "MERCHANT_GROUP_DELETE_ERROR";
                /*** 商戶銀行卡保存失敗，請確認*/
                public static final String MERCHANT_ACCOUNT_SAVE_ERROR = "MERCHANT_ACCOUNT_SAVE_ERROR";
                /*** 商戶銀行卡狀態保存失敗，請確認*/
                public static final String MERCHANT_ACCOUNT_STATUS_SAVE_ERROR = "MERCHANT_ACCOUNT_STATUS_SAVE_ERROR";
                /*** 傳入的uuid爲空，請確認*/
                public static final String MERCHANT_ACCOUNT_UUID_ERROR = "MERCHANT_ACCOUNT_UUID_ERROR";
                /*** 商戶銀行卡刪除失敗，請確認*/
                public static final String MERCHANT_ACCOUNT_DELETE_ERROR = "MERCHANT_ACCOUNT_DELETE_ERROR";
                /**
                 * 商户银行卡审核信息查询失败
                 */
                public static final String MERCHANT_BANK_CARD_AUDIT_SELECT_ERROR = "MERCHANT_BANK_CARD_AUDIT_SELECT_ERROR";
                /**
                 * 修改商户银行卡表信息失敗
                 */
                public static final String UPDATE_MERCHANT_BANK_CARD_TABLE_ERROR = "UPDATE_MERCHANT_BANK_CARD_TABLE_ERROR";
                /**
                 * 修改商户银行卡审核表信息失敗
                 */
                public static final String UPDATE_MERCHANT_BANK_CARD_AUDIT_TABLE_ERROR = "UPDATE_MERCHANT_BANK_CARD_AUDIT_TABLE_ERROR";
                /*** 商户银行卡信息審核中不能進行解綁操作*/
                public static final String MERCHANT_BANK_STATUS_ERROR = "MERCHANT_BANK_STATUS_ERROR";
                /*** 保存聯絡人失敗，請確認*/
                public static final String MERCHANT_CONTACT_SAVE_ERROR = "MERCHANT_CONTACT_SAVE_ERROR";
                /*** 刪除聯絡人失敗，請確認*/
                public static final String MERCHANT_CONTACT_DELETE_ERROR = "MERCHANT_CONTACT_DELETE_ERROR";
                /*** 修改聯絡人信息狀態失敗，請確認*/
                public static final String MERCHANT_CONTACT_STATUS_SAVE_ERROR = "MERCHANT_CONTACT_STATUS_SAVE_ERROR";
                /*** 商戶合約保存失敗，請確認*/
                public static final String MERCHANT_CONTRACT_SAVE_ERROR = "MERCHANT_CONTRACT_SAVE_ERROR";
                /*** 商戶合約狀態保存失敗，請確認*/
                public static final String MERCHANT_CONTRACT_STATUS_SAVE_ERROR = "MERCHANT_CONTRACT_STATUS_SAVE_ERROR";
                /*** 審核並修改狀態失敗，請確認*/
                public static final String MERCHANT_CONFIRM_SUBMIT_ERROR = "MERCHANT_CONFIRM_SUBMIT_ERROR";
                /*** 商戶基本資料審核信息獲取失敗，請確認*/
                public static final String MERCHANT_DETAILS_AUDIT_GET_ERROR = "MERCHANT_DETAILS_AUDIT_GET_ERROR";
                /*** 商戶基本資料審核信息獲取失敗*/
                public static final String MERCHANT_DETAILS_AUDIT_UPDATE_ERROR = "MERCHANT_DETAILS_AUDIT_UPDATE_ERROR";
                /*** 商戶及银行卡信息保存失敗，請確認*/
                public static final String MERCHANT_UPDATE_BASICS_ERROR = "MERCHANT_UPDATE_BASICS_ERROR";
                /*** 保存文件資料失敗，請確認*/
                public static final String MERCHANT_FILE_RESOURCE_SAVE_ERROR = "MERCHANT_FILE_RESOURCE_SAVE_ERROR";
                /*** 保存商戶組設定失敗，請確認*/
                public static final String SAVE_MERCHANT_GROUP_ERROR = "SAVE_MERCHANT_GROUP_ERROR";
                /*** 保存商戶組狀態失敗，請確認*/
                public static final String SAVE_MERCHANT_GROUP_STATUS_ERROR = "SAVE_MERCHANT_GROUP_STATUS_ERROR";
                /*** 刪除商戶組設定失敗，請確認*/
                public static final String DELETE_MERCHANT_GROUP_ERROR = "DELETE_MERCHANT_GROUP_ERROR";
                /*** 商戶初始選單數據保存失敗，請確認*/
                public static final String MERCHANT_INITIAL_MENU_SAVE_ERROR = "MERCHANT_INITIAL_MENU_SAVE_ERROR";
                /*** 商戶初始選單刪除失敗，請確認*/
                public static final String MERCHANT_INITIAL_MENU_DELETE_ERROR = "MERCHANT_INITIAL_MENU_DELETE_ERROR";
                /*** 商戶默認選單同步失敗，請確認*/
                public static final String MERCHANT_INITIAL_MENU_SYNCHRONIZE_ERROR = "MERCHANT_INITIAL_MENU_SYNCHRONIZE_ERROR";
                /*** 商戶系統初始角色保存失敗，請確認*/
                public static final String MERCHANT_INITIAL_ROLE_SAVE_ERROR = "MERCHANT_INITIAL_ROLE_SAVE_ERROR";
                /*** 商戶系統初始角色刪除失敗，請確認*/
                public static final String MERCHANT_INITIAL_ROLE_DELETE_ERROR = "MERCHANT_INITIAL_ROLE_DELETE_ERROR";
                /*** 商戶系統默認角色同步失敗，請確認*/
                public static final String MERCHANT_INITIAL_ROLE_SYNCHRONIZE_ERROR = "MERCHANT_INITIAL_ROLE_SYNCHRONIZE_ERROR";
                /*** 未查詢到對應的商戶密鑰信息，請確認*/
                public static final String MERCHANT_KEY_GET_ERROR = "MERCHANT_KEY_GET_ERROR";
                /*** 商戶密鑰保存失敗，請確認*/
                public static final String MERCHANT_KEY_SAVE_ERROR = "MERCHANT_KEY_SAVE_ERROR";
                /*** 商戶部門數據保存失敗，請確認*/
                public static final String MERCHANT_SYS_DEPT_SAVE_ERROR = "MERCHANT_SYS_DEPT_SAVE_ERROR";
                /*** 商戶選單數據保存失敗，請確認*/
                public static final String MERCHANT_SYS_MENU_SAVE_ERROR = "MERCHANT_SYS_MENU_SAVE_ERROR";
                /*** 商戶選單刪除失敗，請確認*/
                public static final String MERCHANT_SYS_MENU_DELETE_ERROR = "MERCHANT_SYS_MENU_DELETE_ERROR";
                /*** 商戶角色數據保存失敗，請確認*/
                public static final String MERCHANT_SYS_ROLE_SAVE_ERROR = "MERCHANT_SYS_ROLE_SAVE_ERROR";
                /*** 商戶角色刪除失敗，請確認*/
                public static final String MERCHANT_SYS_ROLE_DELETE_ERROR = "MERCHANT_SYS_ROLE_DELETE_ERROR";
                /*** 商戶子帳號信息保存失敗，請確認*/
                public static final String MERCHANT_SYS_USER_SAVE_ERROR = "MERCHANT_SYS_USER_SAVE_ERROR";
                /*** 商戶子帳號刪除失敗，請確認*/
                public static final String MERCHANT_SYS_USER_DELETE_ERROR = "MERCHANT_SYS_USER_DELETE_ERROR";
                /*** 商戶子帳號-修改狀態失敗，請確認*/
                public static final String MERCHANT_USER_STATUS_SAVE_ERROR = "MERCHANT_USER_STATUS_SAVE_ERROR";
                /*** 輸入組名不能為空，請確認*/
                public static final String GROUP_ID_PARAM_ERROR = "GROUP_ID_PARAM_ERROR";
                /*** 組名ID和商戶ID不能為空，請確認*/
                public static final String GROUP_AND_MERCHANT_ID_PARAM_ERROR = "GROUP_AND_MERCHANT_ID_PARAM_ERROR";
                /*** 當前組名ID和商戶ID已經綁定，請確認*/
                public static final String GROUP_AND_MERCHANT_ID_BIND_ERROR = "GROUP_AND_MERCHANT_ID_BIND_ERROR";
                /*** 請輸入正確的組名ID和商戶ID*/
                public static final String GROUP_AND_MERCHANT_ID_VERIFY_ERROR = "GROUP_AND_MERCHANT_ID_VERIFY_ERROR";
                /*** 商戶銀行卡綁定失敗，請確認*/
                public static final String MERCHANT_ACCOUNT_BIND_ERROR = "MERCHANT_ACCOUNT_BIND_ERROR";
                /*** 商户銀行卡審核信息保存失敗，請確認*/
                public static final String MERCHANT_ACCOUNT_AUDIT_SAVE_ERROR = "MERCHANT_ACCOUNT_AUDIT_SAVE_ERROR";
                /*** 商户銀行卡異動信息保存失敗，請確認*/
                public static final String MERCHANT_ACCOUNT_LOG_SAVE_ERROR = "MERCHANT_ACCOUNT_LOG_SAVE_ERROR";
                /*** 更新申請狀態失敗請聯係管理員*/
                public static final String MERCHANT_APPLY_UPDATE_ERROR = "MERCHANT_APPLY_UPDATE_ERROR";
                /*** 商戶申請信息保存失敗*/
                public static final String MERCHANT_APPLY_SAVE_ERROR = "MERCHANT_APPLY_SAVE_ERROR";
                /*** 商戶銀行卡信息獲取失敗*/
                public static final String MERCHANT_ACCOUNT_GET_ERROR = "MERCHANT_ACCOUNT_GET_ERROR";
                /*** 商戶銀行卡信息已被刪除*/
                public static final String MERCHANT_ACCOUNT_DELETED_ERROR = "MERCHANT_ACCOUNT_DELETED_ERROR";
                /*** 商戶銀行卡審核信息獲取失敗*/
                public static final String MERCHANT_ACCOUNT_AUDIT_GET_ERROR = "MERCHANT_ACCOUNT_AUDIT_GET_ERROR";
                /*** 提款密碼生成失敗*/
                public static final String WITHDRAW_PW_GENERATE_ERROR = "WITHDRAW_PW_GENERATE_ERROR";
                /*** 新建聯絡人信息獲取失敗*/
                public static final String MERCHANT_CONTACT_GET_ERROR = "MERCHANT_CONTACT_GET_ERROR";
                /*** 新建聯絡人信息已被刪除*/
                public static final String MERCHANT_CONTACT_DELETED_ERROR = "MERCHANT_CONTACT_DELETED_ERROR";
                /*** 商戶平臺商戶狀態信息保存失敗*/
                public static final String MERCHANT_PLATFORM_INFO_SAVE_ERROR = "MERCHANT_PLATFORM_INFO_SAVE_ERROR";
                /*** 未檢索到商戶平臺數據*/
                public static final String MERCHANT_PLATFORM_INFO_GET_ERROR = "MERCHANT_PLATFORM_INFO_GET_ERROR";
                /*** 商戶數據已提交申請，無法進行再次確認提交*/
                public static final String MERCHANT_REPEAT_SUBMIT_ERROR = "MERCHANT_REPEAT_SUBMIT_ERROR";
                /*** 商戶主檔信息查詢失敗*/
                public static final String MERCHANT_GET_ERROR = "MERCHANT_GET_ERROR";
                /*** 商戶詳情信息查詢失敗*/
                public static final String MERCHANT_DETAILS_GET_ERROR = "MERCHANT_DETAILS_GET_ERROR";
                /*** 商戶詳情信息審核中不能進行修改操作*/
                public static final String MERCHANT_DETAILS_STATUS_ERROR = "MERCHANT_DETAILS_STATUS_ERROR";
                /*** 商戶主賬戶信息保存失敗*/
                public static final String MERCHANT_MAIN_SYS_USER_SAVE_ERROR = "MERCHANT_MAIN_SYS_USER_SAVE_ERROR";
                /*** 商戶頂級部門信息保存失敗*/
                public static final String MERCHANT_MAIN_SYS_DEPT_SAVE_ERROR = "MERCHANT_MAIN_SYS_DEPT_SAVE_ERROR";
                /*** 商戶職員部門關係數據保存失敗*/
                public static final String MERCHANT_SYS_USER_DEPT_SAVE_ERROR = "MERCHANT_SYS_USER_DEPT_SAVE_ERROR";
                /*** 商戶職員角色關係信息保存失敗*/
                public static final String MERCHANT_SYS_USER_ROLE_SAVE_ERROR = "MERCHANT_SYS_USER_ROLE_SAVE_ERROR";
                /*** 商戶選單角色關係信息保存失敗*/
                public static final String MERCHANT_SYS_ROLE_MENU_SAVE_ERROR = "MERCHANT_SYS_ROLE_MENU_SAVE_ERROR";
                /*** 商戶選單角色關係信息刪除失敗*/
                public static final String MERCHANT_SYS_ROLE_MENU_DELETE_ERROR = "MERCHANT_SYS_ROLE_MENU_DELETE_ERROR";
                /*** 輸入的商戶申請ID不能為空，請確認*/
                public static final String MERCHANT_APPLY_ID_PARAM_ERROR = "MERCHANT_APPLY_ID_PARAM_ERROR";
                /*** 未查詢到對應的商戶申請信息，請確認*/
                public static final String MERCHANT_APPLY_GET_ERROR = "MERCHANT_APPLY_GET_ERROR";
                /*** 未查詢到當前商戶聯絡人信息，請確認*/
                public static final String MERCHANT_CONTENT_GET_ERROR = "MERCHANT_CONTENT_GET_ERROR";
                /*** 當前商戶聯絡人信息已被刪除，請確認*/
                public static final String MERCHANT_CONTENT_DELETED_ERROR = "MERCHANT_CONTENT_DELETED_ERROR";
                /*** 商戶聯絡人類別不能爲空，請確認*/
                public static final String MERCHANT_CONTENT_TYPE_PARAM_ERROR = "MERCHANT_CONTENT_TYPE_PARAM_ERROR";
                /*** 商戶ID不能爲空，請確認*/
                public static final String MERCHANT_ID_PARAM_ERROR = "MERCHANT_ID_PARAM_ERROR";
                /*** 商戶聯絡人ID不能爲空，請確認*/
                public static final String MERCHANT_CONTENT_ID_PARAM_ERROR = "MERCHANT_CONTENT_ID_PARAM_ERROR";
                /*** 當前聯絡人為最後一個主要聯絡人，不能刪除*/
                public static final String MERCHANT_CONTENT_DELETE_ERROR = "MERCHANT_CONTENT_DELETE_ERROR";
                /*** 請添加一個主要聯係人並審核通過時,再修改此聯係人*/
                public static final String MERCHANT_CONTENT_UPDATE_ERROR = "MERCHANT_CONTENT_UPDATE_ERROR";
                /*** 商戶詳情信息保存失敗*/
                public static final String MERCHANT_DETAILS_SAVE_ERROR = "MERCHANT_DETAILS_SAVE_ERROR";
                /*** 姓名不能爲空，請確認*/
                public static final String MERCHANT_NAME_PARAM_ERROR = "MERCHANT_NAME_PARAM_ERROR";
                /*** 職稱不能爲空，請確認*/
                public static final String MERCHANT_JOB_PARAM_ERROR = "MERCHANT_JOB_PARAM_ERROR";
                /*** 電話不能爲空，請確認*/
                public static final String MERCHANT_PHONE_PARAM_ERROR = "MERCHANT_PHONE_PARAM_ERROR";
                /*** Email不能爲空，請確認*/
                public static final String MERCHANT_EMAIL_PARAM_ERROR = "MERCHANT_EMAIL_PARAM_ERROR";
                /*** 未查詢到當前商戶合約信息，請確認*/
                public static final String MERCHANT_CONTRACT_GET_ERROR = "MERCHANT_CONTRACT_GET_ERROR";
                /*** 未查詢到當前文件資源信息，請確認*/
                public static final String MERCHANT_FILE_RESOURCE_GET_ERROR = "MERCHANT_FILE_RESOURCE_GET_ERROR";
                /*** 當前文件資源信息已被刪除，請確認*/
                public static final String MERCHANT_FILE_RESOURCE_DELETED_ERROR = "MERCHANT_FILE_RESOURCE_DELETED_ERROR";
                /*** 商戶組名稱未設置，請確認*/
                public static final String MERCHANT_GROUP_NAME_PARAM_ERROR = "MERCHANT_GROUP_NAME_PARAM_ERROR";
                /*** 當前輸入的商戶組名重複，請確認*/
                public static final String MERCHANT_GROUP_NAME_REPEAT_ERROR = "MERCHANT_GROUP_NAME_REPEAT_ERROR";
                /*** 未查詢到當前商戶組信息，請確認*/
                public static final String MERCHANT_GROUP_GET_ERROR = "MERCHANT_GROUP_GET_ERROR";
                /*** 商戶支付方式明細信息保存失敗*/
                public static final String MERCHANT_PAYMENT_ITEM_SAVE_ERROR = "MERCHANT_PAYMENT_ITEM_SAVE_ERROR";
                /*** 商戶支付方式主信息保存失敗*/
                public static final String MERCHANT_PAYMENT_MASTER_SAVE_ERROR = "MERCHANT_PAYMENT_MASTER_SAVE_ERROR";
                /*** 商戶支付方式明細信息修改失敗*/
                public static final String MERCHANT_PAYMENT_ITEM_UPDATE_ERROR = "MERCHANT_PAYMENT_ITEM_UPDATE_ERROR";
                /*** 商戶支付方式主信息獲取失敗*/
                public static final String MERCHANT_PAYMENT_MASTER_GET_ERROR = "MERCHANT_PAYMENT_MASTER_GET_ERROR";
                /*** 商戶支付方式主信息已被刪除*/
                public static final String MERCHANT_PAYMENT_MASTER_DELETED_ERROR = "MERCHANT_PAYMENT_MASTER_DELETED_ERROR";
                /*** 請至少選擇一位商戶進行同步*/
                public static final String MERCHANT_INITIAL_SYNCHRONIZE_PARAM_ERROR = "MERCHANT_INITIAL_SYNCHRONIZE_PARAM_ERROR";
                /*** 已存在相同的商戶初始選單信息，請確認*/
                public static final String MERCHANT_INITIAL_MENU_REPEAT_ERROR = "MERCHANT_INITIAL_MENU_REPEAT_ERROR";
                /*** 商戶初始選單ID不能爲空*/
                public static final String MERCHANT_INITIAL_MENU_ID_PARAM_ERROR = "MERCHANT_INITIAL_MENU_ID_PARAM_ERROR";
                /*** 未查詢到商戶初始選單的對應數據*/
                public static final String MERCHANT_INITIAL_MENU_ID_GET_ERROR = "MERCHANT_INITIAL_MENU_ID_GET_ERROR";
                /*** 商戶主檔信息保存失敗*/
                public static final String MERCHANT_SAVE_ERROR = "MERCHANT_SAVE_ERROR";
                /*** 商戶賬戶餘額信息保存失敗*/
                public static final String MERCHANT_BALANCE_SAVE_ERROR = "MERCHANT_BALANCE_SAVE_ERROR";
                /*** 公司名稱不能爲空，請確認*/
                public static final String MERCHANT_COMPANY_NAME_PARAM_ERROR = "MERCHANT_COMPANY_NAME_PARAM_ERROR";
                /*** 公司登記地址不能爲空，請確認*/
                public static final String MERCHANT_REGISTERED_ADDRESS_PARAM_ERROR = "MERCHANT_REGISTERED_ADDRESS_PARAM_ERROR";
                /*** 戶籍地址不能爲空，請確認*/
                public static final String MERCHANT_CENSUS_REGISTER_ADDRESS_PARAM_ERROR = "MERCHANT_CENSUS_REGISTER_ADDRESS_PARAM_ERROR";
                /*** 公司負責人身分證不能爲空，請確認*/
                public static final String MERCHANT_OWNER_ID_PARAM_ERROR = "MERCHANT_OWNER_ID_PARAM_ERROR";
                /*** 發證年份不能爲空，請確認*/
                public static final String MERCHANT_DATE_OF_ISSUE_PARAM_ERROR = "MERCHANT_DATE_OF_ISSUE_PARAM_ERROR";
                /*** 公司代表電話不能爲空，請確認*/
                public static final String MERCHANT_PHONE_NUMBER_PARAM_ERROR = "MERCHANT_PHONE_NUMBER_PARAM_ERROR";
                /*** 公司營業地址不能爲空，請確認*/
                public static final String MERCHANT_BUSINESS_ADDRESS_PARAM_ERROR = "MERCHANT_BUSINESS_ADDRESS_PARAM_ERROR";
                /*** 公司產業別不能爲空，請確認*/
                public static final String MERCHANT_INDUSTRY_CATEGORY_PARAM_ERROR = "MERCHANT_INDUSTRY_CATEGORY_PARAM_ERROR";
                /*** 匯款銀行名稱不能爲空，請確認*/
                public static final String MERCHANT_BANK_CODE_PARAM_ERROR = "MERCHANT_BANK_CODE_PARAM_ERROR";
                /*** 匯款分行名稱不能爲空，請確認*/
                public static final String MERCHANT_BANK_NAME_PARAM_ERROR = "MERCHANT_BANK_NAME_PARAM_ERROR";
                /*** 匯款帳戶名稱不能爲空，請確認*/
                public static final String MERCHANT_ACCOUNT_NAME_PARAM_ERROR = "MERCHANT_ACCOUNT_NAME_PARAM_ERROR";
                /*** 匯款帳號不能爲空，請確認*/
                public static final String MERCHANT_ACCOUNT_ID_PARAM_ERROR = "MERCHANT_ACCOUNT_ID_PARAM_ERROR";
                /*** 聯絡人姓名不能爲空，請確認*/
                public static final String MERCHANT_CONTACT_NAME_PARAM_ERROR = "MERCHANT_CONTACT_NAME_PARAM_ERROR";
                /*** 文件圖片資源不能爲空，請確認*/
                public static final String MERCHANT_FILE_RESOURCE_ID_PARAM_ERROR = "MERCHANT_FILE_RESOURCE_ID_PARAM_ERROR";
                /*** 商戶圖片類型不能爲空，請確認*/
                public static final String MERCHANT_IMAGE_TYPE_PARAM_ERROR = "MERCHANT_IMAGE_TYPE_PARAM_ERROR";
                /*** 合約編號不能爲空，請確認*/
                public static final String MERCHANT_CONTRACT_NUMBER_PARAM_ERROR = "MERCHANT_CONTRACT_NUMBER_PARAM_ERROR";
                /*** 合約版號不能爲空，請確認*/
                public static final String MERCHANT_CONTRACT_VERSION_NUMBER_PARAM_ERROR = "MERCHANT_CONTRACT_VERSION_NUMBER_PARAM_ERROR";
                /*** 專案類型不能爲空，請確認*/
                public static final String MERCHANT_CONTRACT_PROJECT_TYPE_PARAM_ERROR = "MERCHANT_CONTRACT_PROJECT_TYPE_PARAM_ERROR";
                /*** 幣別不能爲空，請確認*/
                public static final String MERCHANT_CURRENCY_ID_PARAM_ERROR = "MERCHANT_CURRENCY_ID_PARAM_ERROR";
                /*** 應付金額不能爲空，請確認*/
                public static final String MERCHANT_AMOUNTS_PAYABLE_PARAM_ERROR = "MERCHANT_AMOUNTS_PAYABLE_PARAM_ERROR";
                /*** 繳費方案不能爲空，請確認*/
                public static final String MERCHANT_PAYMENT_PLAN_PARAM_ERROR = "MERCHANT_PAYMENT_PLAN_PARAM_ERROR";
                /*** 付款日期不能爲空，請確認*/
                public static final String MERCHANT_PAYMENT_DATE_PARAM_ERROR = "MERCHANT_PAYMENT_DATE_PARAM_ERROR";
                /*** 合約開始日與結束日不能爲空，請確認*/
                public static final String MERCHANT_CONTRACT_START_AND_END_PARAM_ERROR = "MERCHANT_CONTRACT_START_AND_END_PARAM_ERROR";
                /*** 當前商戶已有相同的合約編號存在，請勿重複添加*/
                public static final String CONTRACT_NUMBER_REPEAT_ERROR = "CONTRACT_NUMBER_REPEAT_ERROR";
                /*** 當前商戶已有相同的合約版號存在，請勿重複添加*/
                public static final String CONTRACT_VERSION_NUMBER_REPEAT_ERROR = "CONTRACT_VERSION_NUMBER_REPEAT_ERROR";
                /*** 部門資訊已被刪除，請確認*/
                public static final String MERCHANT_DEPT_IS_DELETE_ERROR = "MERCHANT_DEPT_IS_DELETE_ERROR";
                /*** 未查詢到部門信息，請確認*/
                public static final String MERCHANT_DEPT_GET_ERROR = "MERCHANT_DEPT_GET_ERROR";
                /*** 最高級部門不可刪除，請確認*/
                public static final String MERCHANT_DEPT_SUPER_DEPT_ERROR = "MERCHANT_DEPT_SUPER_DEPT_ERROR";
                /*** 請先刪除相關子部門資訊*/
                public static final String MERCHANT_DEPT_HAVE_SUB_DEPT_ERROR = "MERCHANT_DEPT_HAVE_SUB_DEPT_ERROR";
                /*** 已存在相同的商戶選單信息，請確認*/
                public static final String MERCHANT_SYS_MENU_REPEAT_ERROR = "MERCHANT_SYS_MENU_REPEAT_ERROR";
                /*** 未查詢到商戶選單信息，請確認*/
                public static final String MERCHANT_SYS_MENU_GET_ERROR = "MERCHANT_SYS_MENU_GET_ERROR";
                /*** 更新密碼失敗，請確認*/
                public static final String MERCHANT_SYS_USER_PASSWORD_SAVE_ERROR = "MERCHANT_SYS_USER_PASSWORD_SAVE_ERROR";
                /*** 商戶職員ID不能爲空，請確認*/
                public static final String MERCHANT_USER_ID_PARAM_ERROR = "MERCHANT_USER_ID_PARAM_ERROR";
                /*** 未查詢到商戶職員信息，請確認*/
                public static final String MERCHANT_SYS_USER_GET_ERROR = "MERCHANT_SYS_USER_GET_ERROR";
                /*** 當前商戶已存在相同的匯款帳號，請勿重複添加*/
                public static final String MERCHANT_ACCOUNT_ID_REPEAT_ERROR = "MERCHANT_ACCOUNT_ID_REPEAT_ERROR";
                /*** 當前商戶匯款帳號正在審核中或已駁回，請勿重複添加*/
                public static final String MERCHANT_ACCOUNT_ID_STATUS_ERROR = "MERCHANT_ACCOUNT_ID_STATUS_ERROR";
                /*** 業務聯絡人和保證人不能相同*/
                public static final String CONTACT_NAME_AND_ENSURE_NAME_NOT_THE_SAME = "CONTACT_NAME_AND_ENSURE_NAME_NOT_THE_SAME";
                /*** 當前商戶聯絡人為最後一個主要聯絡人，禁止停用*/
                public static final String MERCHANT_CONTENT_STATUS_ERROR = "MERCHANT_CONTENT_STATUS_ERROR";
                /*** 商戶網址付及3D授權設定保存失敗*/
                public static final String QUICKPAY_AND_SETTING_SAVE_ERROR = "QUICKPAY_AND_SETTING_SAVE_ERROR";
                /*** 商戶URL設定審核訊息已被刪除，請確認*/
                public static final String MERCHANT_URL_SETTING_AUDIT_DELETE_ERROR = "MERCHANT_URL_SETTING_AUDIT_DELETE_ERROR";
                /*** 商戶URL設定訊息已被刪除，請確認*/
                public static final String MERCHANT_URL_SETTING_DELETE_ERROR = "MERCHANT_URL_SETTING_DELETE_ERROR";
                /*** 商戶URL設定訊息修改失敗。*/
                public static final String MERCHANT_URL_SETTING_UPDATE_ERROR = "MERCHANT_URL_SETTING_UPDATE_ERROR";
                /*** 商戶URL設定審核中不能進行修改操作*/
                public static final String MERCHANT_URL_SETTING_STATUS_ERROR = "MERCHANT_URL_SETTING_STATUS_ERROR";
                /*** 商戶URL設定表新增url設定失敗,請檢測數據*/
                public static final String MERCHANT_URL_SETTING_INSERT_ERROR = "MERCHANT_URL_SETTING_INSERT_ERROR";
                /*** 商戶URL設定審核表新增url設定審核失敗,請檢測數據*/
                public static final String MERCHANT_URL_SETTING_AUDIT_INSERT_ERROR = "MERCHANT_URL_SETTING_AUDIT_INSERT_ERROR";
                /*** 當前銀行卡是商戶最後一個可用銀行卡，禁止解綁*/
                public static final String MERCHANT_ACCOUNT_UNBINDING_PROHIBIT_ERROR = "MERCHANT_ACCOUNT_UNBINDING_PROHIBIT_ERROR";
                /*** 當前銀行卡是商戶最後一個可用銀行卡，禁止停用*/
                public static final String MERCHANT_ACCOUNT_ENABLED_STATUS_ERROR = "MERCHANT_ACCOUNT_ENABLED_STATUS_ERROR";
                /**
                 * 商戶可用通道訊息已存在，請確認
                 */
                public static final String MERCHANT_PLATFORM_RELATION_ERROR = "MERCHANT_PLATFORM_RELATION_ERROR";
                /**
                 * 商戶可用通道訊息添加失敗，請確認
                 */
                public static final String MERCHANT_PLATFORM_RELATION_SAVE_ERROR = "MERCHANT_PLATFORM_RELATION_SAVE_ERROR";
                /**
                 * 商戶可用通道訊息修改失敗，請確認
                 */
                public static final String MERCHANT_PLATFORM_RELATION_UPDATE_ERROR = "MERCHANT_PLATFORM_RELATION_UPDATE_ERROR";
                /**
                 * 商戶可用通道訊息查詢失敗，請確認
                 */
                public static final String MERCHANT_PLATFORM_RELATION_SELECT_ERROR = "MERCHANT_PLATFORM_RELATION_SELECT_ERROR";
                /**
                 * 當前選擇的MccCode為大項,請選擇MccCode細項
                 */
                public static final String MERCHANT_DETAILS_MCC_CODE_CHOOSE_ERROR = "MERCHANT_DETAILS_MCC_CODE_CHOOSE_ERROR";
                /**
                 * 當前選擇的營業類別大項,請選擇營業類別小項
                 */
                public static final String MERCHANT_DETAILS_BUSINESS_CATEGORY_MAJOR_CHOOSE_ERROR = "MERCHANT_DETAILS_BUSINESS_CATEGORY_MAJOR_CHOOSE_ERROR";
                /**
                 * 當前選擇的營業類別中項,請選擇營業類別小項
                 */
                public static final String MERCHANT_DETAILS_BUSINESS_CATEGORY_MEDIUM_CHOOSE_ERROR = "MERCHANT_DETAILS_BUSINESS_CATEGORY_MEDIUM_CHOOSE_ERROR";
                /**
                 * 營養類別最多只能選擇三個,不能選擇超過三個
                 */
                public static final String MERCHANT_DETAILS_BUSINESS_CATEGORY_CHOOSE_MUCH_ERROR = "MERCHANT_DETAILS_BUSINESS_CATEGORY_CHOOSE_MUCH_ERROR";
                /***當前商戶申請未綁定指派業務負責人*/
                public static final String THIS_MERCHANT_NOT_BIND_ASSIGN_BUSINESS_USER = "THIS_MERCHANT_NOT_BIND_ASSIGN_BUSINESS_USER";
                /***當前登錄人不是指派業務負責人*/
                public static final String ASSIGN_BUSINESS_USER_NO_LOGIN_USER = "ASSIGN_BUSINESS_USER_NO_LOGIN_USER";
                /***  商戶地址詳情审核訊息保存失敗。*/
                public static final String MERCHANT_DETAILS_ADDRESS_AUDIT_SAVE_ERROR = "MERCHANT_DETAILS_ADDRESS_AUDIT_SAVE_ERROR";
                /***  商戶地址詳情訊息修改失敗。*/
                public static final String MERCHANT_DETAILS_ADDRESS_UPDATE_ERROR = "MERCHANT_DETAILS_ADDRESS_UPDATE_ERROR";
                /***  商戶地址詳情审核訊息修改失敗。*/
                public static final String MERCHANT_DETAILS_ADDRESS_AUDIT_UPDATE_ERROR = "MERCHANT_DETAILS_ADDRESS_AUDIT_UPDATE_ERROR";
                /***  商戶地址詳情訊息保存失敗。*/
                public static final String MERCHANT_DETAILS_ADDRESS_SAVE_ERROR = "MERCHANT_DETAILS_ADDRESS_SAVE_ERROR";
                /***  商戶商戶報送編碼表插入數據失敗,請檢查數據。*/
                public static final String MERCHANT_SUBMIT_CODE_INSERT_ERROR = "MERCHANT_SUBMIT_CODE_INSERT_ERROR";
                /***  只有商戶資料審核狀態為審核通過時才能進行商戶狀態修改,請確認數據。*/
                public static final String MERCHANT_PLATFORM_INFO_AUDIT_STATUS_ERROR = "MERCHANT_PLATFORM_INFO_AUDIT_STATUS_ERROR";
                /***  商戶修改狀態與商戶當前狀態一致,請確認數據。*/
                public static final String MERCHANT_PLATFORM_INFO_MERCHANT_STATUS_ERROR = "MERCHANT_PLATFORM_INFO_MERCHANT_STATUS_ERROR";
                /***  商戶報送編碼表刪除數據失敗,請檢查數據。*/
                public static final String MERCHANT_SUBMIT_CODE_DELETE_ERROR = "MERCHANT_SUBMIT_CODE_DELETE_ERROR";
                /**
                 * 當前選擇的MccCode中項,未查到對應分類名稱
                 */
                public static final String MERCHANT_DETAILS_MCC_CODE_SELECT_CATEGORY_NAME_ERROR = "MERCHANT_DETAILS_MCC_CODE_SELECT_CATEGORY_NAME_ERROR";
                /***  商戶保證人訊息查詢失敗,請確認數據。*/
                public static final String MERCHANT_GUARANTOR_SELECT_ERROR = "MERCHANT_GUARANTOR_SELECT_ERROR";
                /***  當前商戶保證人訊息已被刪除,請確認數據。*/
                public static final String MERCHANT_GUARANTOR_IS_DELETE_ERROR = "MERCHANT_GUARANTOR_IS_DELETE_ERROR";
                /***  商戶保證人訊息保存失敗,請確認數據。*/
                public static final String MERCHANT_GUARANTOR_SAVE_ERROR = "MERCHANT_GUARANTOR_SAVE_ERROR";
                /***  商戶保證人訊息修改失敗,請確認數據。*/
                public static final String MERCHANT_GUARANTOR_UPDATE_ERROR = "MERCHANT_GUARANTOR_UPDATE_ERROR";
                /*** 當前商戶支付方式下支付工具已存在一個審核事件，請審核后再進行修改*/
                public static final String MERCHANT_PAYMENT_MASTER_TOOLS_TYPE_ALREADY_AUDIT_ERROR = "MERCHANT_PAYMENT_MASTER_TOOLS_TYPE_ALREADY_AUDIT_ERROR";
                /*** IP地址數量最多5條，請重新輸入*/
                public static final String MERCHANT_SYS_USER_IP_ADDRESS_QUANTITY_ERROR = "MERCHANT_SYS_USER_IP_ADDRESS_QUANTITY_ERROR";
                /*** 當前職員郵箱已存在，請重新輸入*/
                public static final String MERCHANT_SYS_USER_EMAIL_REPEAT_ERROR = "MERCHANT_SYS_USER_EMAIL_REPEAT_ERROR";
                /*** 當前職員登錄郵箱已在商户审核中，請確認*/
                public static final String MERCHANT_APPLY_EMAIL_REPEAT_ERROR = "MERCHANT_APPLY_EMAIL_REPEAT_ERROR";
                /*** 當前公司編碼已存在，請重新輸入*/
                public static final String SAVE_ENTERPRISE_CODE_HAVE_ERROR = "SAVE_ENTERPRISE_CODE_HAVE_ERROR";
                /*** 公司訊息保存失敗，請確認數據*/
                public static final String SAVE_ENTERPRISE_ERROR = "SAVE_ENTERPRISE_ERROR";
            }

            public static class NoticeMessage {
                /*** 保存通知主檔失敗，請確認*/
                public static final String NOTICE_MASTER_SAVE_ERROR = "NOTICE_MASTER_SAVE_ERROR";
                /*** 保存通知對象失敗，請確認*/
                public static final String NOTICE_TARGET_SAVE_ERROR = "NOTICE_TARGET_SAVE_ERROR";
                /*** 保存通知内容失敗，請確認*/
                public static final String NOTICE_CONTENT_SAVE_ERROR = "NOTICE_CONTENT_SAVE_ERROR";
                /*** 保存通知參數失敗，請確認*/
                public static final String NOTICE_PARAM_SAVE_ERROR = "NOTICE_PARAM_SAVE_ERROR";
                /*** 通知發送臨時主表保存信息失敗，請確認*/
                public static final String NOTICE_SEND_TEMP_MASTER_SAVE_ERROR = "NOTICE_SEND_TEMP_MASTER_SAVE_ERROR";
                /*** 重新發送通知失敗，請確認*/
                public static final String NOTICE_RESEND_ERROR = "NOTICE_RESEND_ERROR";
                /*** 向選擇的人員列表發送通知失敗*/
                public static final String NOTICE_CHOOSE_SEND_ERROR = "NOTICE_CHOOSE_SEND_ERROR";
                /*** 向全部人員列表發送通知失敗*/
                public static final String NOTICE_ALL_SEND_ERROR = "NOTICE_ALL_SEND_ERROR";
                /*** 修改推送開關狀態失敗*/
                public static final String NOTICE_SWITCHES_SAVE_ERROR = "NOTICE_SWITCHES_SAVE_ERROR";
                /*** 修改通知對象發送語系失敗*/
                public static final String NOTICE_LANGUAGE_SAVE_ERROR = "NOTICE_LANGUAGE_SAVE_ERROR";
                /*** 通知内容不能為空，請確認*/
                public static final String NOTICE_CONTENT_ID_PARAM_ERROR = "NOTICE_CONTENT_ID_PARAM_ERROR";
                /*** 内容格式有誤，{}内必須爲數字0~29之間*/
                public static final String NOTICE_CONTENT_PARAM_ERROR = "NOTICE_CONTENT_PARAM_ERROR";
                /*** 未查詢到通知主檔信息，請確認*/
                public static final String NOTICE_MASTER_GET_ERROR = "NOTICE_MASTER_GET_ERROR";
                /*** 未查詢到通知對象信息，請確認*/
                public static final String NOTICE_TARGET_GET_ERROR = "NOTICE_TARGET_GET_ERROR";
                /*** 未查詢到通知記錄信息，請確認*/
                public static final String NOTICE_SEND_RECORD_GET_ERROR = "NOTICE_SEND_RECORD_GET_ERROR";
                /*** 已設置過相同參數，請確認*/
                public static final String NOTICE_PARAM_KEY_ERROR = "NOTICE_PARAM_KEY_ERROR";
                /*** 通知編碼不能為空，請確認*/
                public static final String NOTICE_CODE_PARAM_ERROR = "NOTICE_CODE_PARAM_ERROR";
                /*** 内容描述不能為空，請確認*/
                public static final String CONTENT_DESCRIPTION_PARAM_ERROR = "CONTENT_DESCRIPTION_PARAM_ERROR";
                /*** 已有相同通知編碼的信息，請確認*/
                public static final String NOTICE_CODE_REPEAT_ERROR = "NOTICE_CODE_REPEAT_ERROR";
                /*** 通知對象類型異常，請確認*/
                public static final String NOTICE_TARGET_TYPE_ERROR = "NOTICE_TARGET_TYPE_ERROR";
                /*** 未檢索到符合條件的人員列表*/
                public static final String NOTICE_PERSONNEL_LIST_ERROR = "NOTICE_PERSONNEL_LIST_ERROR";
                /*** 請選擇通知主檔*/
                public static final String NOTICE_MASTER_ID_PARAM_ERROR = "NOTICE_MASTER_ID_PARAM_ERROR";
                /*** 請選擇通知對象*/
                public static final String NOTICE_TARGET_ID_PARAM_ERROR = "NOTICE_TARGET_ID_PARAM_ERROR";
                /*** 已有相同的通知對象信息，請確認*/
                public static final String NOTICE_TARGET_REPEAT_ERROR = "NOTICE_TARGET_REPEAT_ERROR";
                /*** 自定義通知地址發送失敗，請確認*/
                public static final String NOTICE_CUSTOM_SEND_ERROR = "NOTICE_CUSTOM_SEND_ERROR";
            }

            public static class OtherMessage {
                /*** UUID不能為空，請確認*/
                public static final String UUID_PARAM_ERROR = "UUID_PARAM_ERROR";
                /*** 當前操作已超出您的增加角色權限範圍*/
                public static final String ADD_ROLE_PERMISSIONS_ERROR = "ADD_ROLE_PERMISSIONS_ERROR";
                /*** 新增用戶所選角色，不是本人創建，請確認*/
                public static final String ADD_USER_ROLE_PERMISSIONS_ERROR = "ADD_USER_ROLE_PERMISSIONS_ERROR";
                /*** 此項目編號在系統語言項目表-内容管理已有數據,請重新輸入。*/
                public static final String SERIAL_NUMBER_REPEAT = "SERIAL_NUMBER_REPEAT";
                /*** 插入系統語言項目表-内容管理失敗。*/
                public static final String SYS_LANGUAGE_SAVE_ERROR = "SYS_LANGUAGE_SAVE_ERROR";
                /*** 插入系統語言項目表-項目編號已存在。*/
                public static final String SYS_LANGUAGE_ITEM_KEY_EXIST = "SYS_LANGUAGE_ITEM_KEY_EXIST";
                /*** 修改系統語言項目表-内容管理失敗。*/
                public static final String SYS_LANGUAGE_UPDATE_ERROR = "SYS_LANGUAGE_UPDATE_ERROR";
                /*** 請至少輸入一個檢索條件*/
                public static final String LEAST_ONE_QUERY_CONDITION_ERROR = "LEAST_ONE_QUERY_CONDITION_ERROR";
                /*** 公司名稱不能爲空，請確認*/
                public static final String ENTERPRISE_NAME_EMPTY = "ENTERPRISE_NAME_EMPTY";
                /*** 公司的上級公司不能爲空，請確認*/
                public static final String ENTERPRISE_PARENT_CODE_EMPTY = "ENTERPRISE_PARENT_CODE_EMPTY";
                /*** 公司編號不能爲空，請確認*/
                public static final String ENTERPRISE_CODE_EMPTY = "ENTERPRISE_CODE_EMPTY";
                /*** 刪除公司下有子公司，無法刪除，請確認*/
                public static final String SUB_ENTERPRISE_IS_EXIST = "SUB_ENTERPRISE_IS_EXIST";
                /*** 公司無法刪除，請確認*/
                public static final String ENTERPRISE_DELETE_ERROR = "ENTERPRISE_DELETE_ERROR";
                /*** 公司無法修改，請確認*/
                public static final String ENTERPRISE_UPDATE_ERROR = "ENTERPRISE_UPDATE_ERROR";
                /*** 總公司無法刪除，請確認*/
                public static final String MAIN_ENTERPRISE_DELETE_ERROR = "MAIN_ENTERPRISE_DELETE_ERROR";
                /*** 設備類型不能爲空，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_TYPE_EMPTY_ERROR = "EQUIPMENT_SCRIPT_MASTER_TYPE_EMPTY_ERROR";
                /*** 脚本編號，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_CODE_EMPTY_ERROR = "EQUIPMENT_SCRIPT_MASTER_CODE_EMPTY_ERROR";
                /*** 脚本主檔信息查詢失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_INFO_ERROR = "EQUIPMENT_SCRIPT_MASTER_INFO_ERROR";
                /*** 脚本主檔主鍵不能爲空，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_ID_EMPTY_ERROR = "EQUIPMENT_SCRIPT_MASTER_ID_EMPTY_ERROR";
                /*** 脚本主檔下有内容，不能刪除，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_EXIST_ERROR = "EQUIPMENT_SCRIPT_CONTENT_EXIST_ERROR";
                /*** 脚本編碼不能重複，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_CODE_EXIST_ERROR = "EQUIPMENT_SCRIPT_MASTER_CODE_EXIST_ERROR";
                /*** 脚本内容執行順序不能爲空，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_STEP_EMPTY_ERROR = "EQUIPMENT_SCRIPT_CONTENT_STEP_EMPTY_ERROR";
                /*** 脚本内容執行順序不能重複，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_STEP_EXIST_ERROR = "EQUIPMENT_SCRIPT_CONTENT_STEP_EXIST_ERROR";
                /*** 脚本内容信息查詢失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_INFO_ERROR = "EQUIPMENT_SCRIPT_CONTENT_INFO_ERROR";
                /*** 脚本内容信息刪除失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_DETELE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_DETELE_ERROR";
                /*** 脚本内容信息更新失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_UPDATE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_UPDATE_ERROR";
                /*** 脚本内容信息保存失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_SAVE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_SAVE_ERROR";
                /*** 脚本主檔信息保存失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_SAVE_ERROR = "EQUIPMENT_SCRIPT_MASTER_SAVE_ERROR";
                /*** 脚本主檔信息更新失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_UPDATE_ERROR = "EQUIPMENT_SCRIPT_MASTER_UPDATE_ERROR";
                /*** 脚本主檔信息刪除失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_DETELE_ERROR = "EQUIPMENT_SCRIPT_MASTER_DETELE_ERROR";
                /*** 脚本主檔信息狀態更新失敗，請確認*/
                public static final String EQUIPMENT_SCRIPT_MASTER_UPDATE_STATUS_ERROR = "EQUIPMENT_SCRIPT_MASTER_UPDATE_STATUS_ERROR";
                /*** 脚本執行順序不能小於0，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_STEP_NEGATIVE_ERROR = "EQUIPMENT_SCRIPT_CONTENT_STEP_NEGATIVE_ERROR";
                /*** 刪除公司下有用戶綁定，無法刪除，請確認*/
                public static final String ENTERPRISE_USER_IS_EXIST = "ENTERPRISE_USER_IS_EXIST";
                /*** 脚本執行編碼首條必須為1，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_EXECUTE_CODE_FIRST_ERROR = "EQUIPMENT_SCRIPT_CONTENT_EXECUTE_CODE_FIRST_ERROR";
                /*** 脚本刪除失敗，存在執行編碼不爲1的其他數據，請確認*/
                public static final String EQUIPMENT_SCRIPT_CONTENT_DETELE_MAIN_ERROR = "EQUIPMENT_SCRIPT_CONTENT_DETELE_MAIN_ERROR";
                /*** 脚本參數信息保存失敗*/
                public static final String EQUIPMENT_PARAM_SETTING_SAVE_ERROR = "EQUIPMENT_PARAM_SETTING_SAVE_ERROR";
                /*** 脚本參數信息更新失敗*/
                public static final String EQUIPMENT_PARAM_SETTING_UPDATE_ERROR = "EQUIPMENT_PARAM_SETTING_UPDATE_ERROR";
                /*** 脚本參數不全，更新失敗*/
                public static final String EQUIPMENT_PARAM_SETTING_UPDATE_PARAM_EMPTY_ERROR = "EQUIPMENT_PARAM_SETTING_UPDATE_PARAM_EMPTY_ERROR";
                /*** 脚本參數信息查詢失敗*/
                public static final String EQUIPMENT_PARAM_SETTING_INFO_ERROR = "EQUIPMENT_PARAM_SETTING_INFO_ERROR";
                /*** 脚本參數信息刪除失敗*/
                public static final String EQUIPMENT_PARAM_SETTING_DELETE_ERROR = "EQUIPMENT_PARAM_SETTING_DELETE_ERROR";
                /*** 脚本返回訊息執行設定更新失敗*/
                public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_UPDATE_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_UPDATE_ERROR";
                /*** 脚本返回訊息執行設定查詢失敗*/
                public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_INFO_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_INFO_ERROR";
                /*** 脚本返回訊息執行設定保存失敗*/
                public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_SAVE_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_SAVE_ERROR";
                /*** 脚本返回訊息執行設定刪除失敗*/
                public static final String EQUIPMENT_RETURN_MESSAGE_EXECUTION_DELETE_ERROR = "EQUIPMENT_RETURN_MESSAGE_EXECUTION_DELETE_ERROR";

            }

            public static class BlackList {
                /*** 限制内容传参錯誤。*/
                public static final String RESTRICTED_CONTENT_ERROR = "RESTRICTED_CONTENT_ERROR";

            }

            public static class PlatformMessage {
                /*** 支付通道編號不能為空 */
                public static final String PAY_PLATFORM_ID_PARAM_ERROR = "PAY_PLATFORM_ID_PARAM_ERROR";
            }

            public static class CommonCategory {
                /*** 父項ID不能爲空*/
                public static final String COMMON_CATEGORY_CODE_PARAM_ERROR = "COMMON_CATEGORY_CODE_PARAM_ERROR";
                /*** 保存新的分類失敗，請確認*/
                public static final String COMMON_CATEGORY_SAVE_ERROR = "COMMON_CATEGORY_SAVE_ERROR";
                /*** 更新分類失敗，請確認*/
                public static final String COMMON_CATEGORY_UPDATE_ERROR = "COMMON_CATEGORY_UPDATE_ERROR";
                /*** 分類ID已存在*/
                public static final String COMMON_CATEGORY_ID_DATA_EXISTS = "COMMON_CATEGORY_ID_DATA_EXISTS";
                /*** 分類ID信息不存在*/
                public static final String COMMON_CATEGORY_GET_ERROR = "COMMON_CATEGORY_GET_ERROR";
                /*** 刪除分類失敗，請確認*/
                public static final String COMMON_CATEGORY_DELETE_ERROR = "COMMON_CATEGORY_DELETE_ERROR";
                /*** 分類ID不能爲空*/
                public static final String COMMON_CATEGORY_ID_CODE_PARAM_ERROR = "COMMON_CATEGORY_ID_CODE_PARAM_ERROR";
            }

            public static class CommonCurrency {
                /*** 未找到符合条件的信息 */
                public static final String COMMON_CURRENCY_CONDITION_NULL = "COMMON_CURRENCY_CONDITION_NULL";
                /*** 货币表插入失败 */
                public static final String COMMON_CURRENCY_INSERT_ERROR = "COMMON_CURRENCY_INSERT_ERROR";
                /*** 货币表更新失败 */
                public static final String COMMON_CURRENCY_UPDATE_ERROR = "COMMON_CURRENCY_UPDATE_ERROR";
                /*** 货币表刪除失败 */
                public static final String COMMON_CURRENCY_DELETED_ERROR = "COMMON_CURRENCY_DELETED_ERROR";
                /*** 货币ID不能爲空 */
                public static final String COMMON_CURRENCY_CURRENCY_ID_NULL = "COMMON_CURRENCY_CURRENCY_ID_NULL";
                /*** 信息已存在 */
                public static final String COMMON_CURRENCY_CONTENT_EXIST = "COMMON_CURRENCY_CONTENT_EXIST";
                /*** 货币名称不能爲空 ...*/
                public static final String COMMON_CURRENCY_CURRENCY_NAME_NULL = "COMMON_CURRENCY_CURRENCY_NAME_NULL";
                /*** 货币名称id不能爲空 ...*/
                public static final String COMMON_CURRENCY_CURRENCY_NAME_ID_NULL = "COMMON_CURRENCY_CURRENCY_NAME_ID_NULL";
                /*** 货币符号不能爲空 ...*/
                public static final String COMMON_CURRENCY_CURRENCY_SYMBOL_NULL = "COMMON_CURRENCY_CURRENCY_SYMBOL_NULL";
                /*** 虚拟货币不能爲空 ...*/
                public static final String COMMON_CURRENCY_CURRENCY_VIRTUALITY_NULL = "COMMON_CURRENCY_CURRENCY_VIRTUALITY_NULL";
                /*** 是否取整不能爲空 ...*/
                public static final String COMMON_CURRENCY_ROUNDING_NULL = "COMMON_CURRENCY_ROUNDING_NULL";
                /*** 货币名称词汇表键值不能爲空 */
                public static final String COMMON_CURRENCY_ITEM_KEY_NULL = "COMMON_CURRENCY_ITEM_KEY_NULL";
                /*** 项目类型不能爲空 */
                public static final String COMMON_CURRENCY_ITEM_TYPE_NULL = "COMMON_CURRENCY_ITEM_TYPE_NULL";
                /*** 功能代碼不能爲空 */
                public static final String COMMON_CURRENCY_FUCTION_CODE_NULL = "COMMON_CURRENCY_FUCTION_CODE_NULL";
                /*** 詞彙語系種類不能爲空 */
                public static final String COMMON_CURRENCY_LANG_TYPE_ID_NULL = "COMMON_CURRENCY_LANG_TYPE_ID_NULL";
            }

            public static class LicenseMessage {
                /*** 授權id為空*/
                public static final String LICENSE_ID_EMPTY = "LICENSE_ID_EMPTY";
                /*** 狀態修改失敗*/
                public static final String LICENSE_UPDATE_STATUS_ERROR = "LICENSE_UPDATE_STATUS_ERROR";
                /*** 审核未通过,狀態修改失敗*/
                public static final String LICENSE_UPDATE_AUDIT_STATUS_ERROR = "LICENSE_UPDATE_AUDIT_STATUS_ERROR";
                /*** 狀態修改失敗,License已過有效期*/
                public static final String LICENSE_UPDATE_STATUS_ERROR_EXPIRATION = "LICENSE_UPDATE_STATUS_ERROR_EXPIRATION";
                /*** 指派者修改失敗*/
                public static final String LICENSE_UPDATE_ASSIGN_USER_ERROR = "LICENSE_UPDATE_ASSIGN_USER_ERROR";
                /*** 新增授權參數有誤，請確認*/
                public static final String LICENSE_SAVE_PARAM_ERROR = "LICENSE_SAVE_PARAM_ERROR";
                /*** 新增授權參數有誤，選擇VolumeLicensing時請填寫CompanyName(限8位英文)*/
                public static final String LICENSE_SAVE_PARAM_ERROR_COMPANY_NAME = "LICENSE_SAVE_PARAM_ERROR_COMPANY_NAME";
                /*** 新增授權參數有誤，VolumeLicensing 與 SM2 不能同時選擇*/
                public static final String LICENSE_SAVE_PARAM_ERROR_SM2 = "LICENSE_SAVE_PARAM_ERROR_SM2";
                /*** 新增授權參錯誤，請重試*/
                public static final String LICENSE_SAVE_ERROR = "LICENSE_SAVE_ERROR";
                /*** 查詢詳細授權參數有誤，請確認*/
                public static final String LICENSE_INFO_PARAM_ERROR = "LICENSE_INFO_PARAM_ERROR";
                /*** 查詢詳細授權錯誤，請重試*/
                public static final String LICENSE_INFO_ERROR = "LICENSE_INFO_ERROR";
                /*** 補償天數新增錯誤，請重試*/
                public static final String LICENSE_BUFFER_DAY_INSTER_ERROR = "LICENSE_BUFFER_DAY_INSTER_ERROR";
                /*** 天数范围已存在，請确认*/
                public static final String LICENSE_BUFFER_DAY_INSTER_ERROR_DAY_EXIST = "LICENSE_BUFFER_DAY_INSTER_ERROR_DAY_EXIST";
                /*** 補償天數更新錯誤，請重試*/
                public static final String LICENSE_BUFFER_DAY_UPDATE_ERROR = "LICENSE_BUFFER_DAY_UPDATE_ERROR";
                /*** 補償天數刪除錯誤，請重試*/
                public static final String LICENSE_BUFFER_DAY_DELETE_ERROR = "LICENSE_BUFFER_DAY_DELETE_ERROR";
                /*** 補償天數查詢錯誤，請重試*/
                public static final String LICENSE_BUFFER_DAY_SELECT_ERROR = "LICENSE_BUFFER_DAY_SELECT_ERROR";
                /*** 補償天數參數範圍錯誤，請重試*/
                public static final String LICENSE_BUFFER_DAY_INSTER_SCOPE_ERROR = "LICENSE_BUFFER_DAY_INSTER_SCOPE_ERROR";
                /*** 補償天數參數不能為空，請重試*/
                public static final String LICENSE_BUFFER_DAY_PARAM_NULL_ERROR = "LICENSE_BUFFER_DAY_PARAM_NULL_ERROR";
                /*** 生成授權失敗，模型code爲空*/
                public static final String LICENSE_CODE_MODEL_CODE_NULL = "LICENSE_CODE_MODEL_CODE_NULL";
                /*** 生成授權失敗，鏈接設備失敗*/
                public static final String LICENSE_CODE_ERROR = "LICENSE_CODE_ERROR";
                /*** 生成授權失敗，發生未知錯誤，請確認License功能與特性*/
                public static final String LICENSE_CODE_GENERATE_ERROR = "LICENSE_CODE_GENERATE_ERROR";

                /*** max sessions數字範圍錯誤，請重試*/
                public static final String MAX_SESSIONS_SCOPE_ERROR = "MAX_SESSIONS_SCOPE_ERROR";
                /*** max virtual portals範圍錯誤(1-256)，請重試*/
                public static final String MAX_VIRTUAL_PORTALS_SCOPE_ERROR = "MAX_VIRTUAL_PORTALS_SCOPE_ERROR";
                /*** site2site_max_tunnels範圍錯誤(0-1000000)，請重試*/
                public static final String SITE2SITE_MAX_TUNNELS_SCOPE_ERROR = "SITE2SITE_MAX_TUNNELS_SCOPE_ERROR";
                /*** pre-paid flex credit days範圍錯誤(1-9999)，請重試*/
                public static final String PRE_PAID_FLEX_CREDIT_DAYS_SCOPE_ERROR = "PRE_PAID_FLEX_CREDIT_DAYS_SCOPE_ERROR";
                /*** cm_max_device範圍錯誤(1-9999)，請重試*/
                public static final String CM_MAX_DEVICE_SCOPE_ERROR = "CM_MAX_DEVICE_SCOPE_ERROR";
            }

            public static class ProductMessage {
                /*** 產品類別id為空*/
                public static final String PRODUCT_CATEGORY_ID_EMPTY = "PRODUCT_CATEGORY_ID_EMPTY";
                /*** 產品模型id為空*/
                public static final String PRODUCT_MODEL_ID_EMPTY = "PRODUCT_MODEL_ID_EMPTY";
                /*** 產品版本id為空*/
                public static final String PRODUCT_VERSION_ID_EMPTY = "PRODUCT_VERSION_ID_EMPTY";
                /*** 產品名稱為空*/
                public static final String PRODUCT_MASTER_NAME_EMPTY = "PRODUCT_MASTER_NAME_EMPTY";
                /*** 產品名稱重複*/
                public static final String PRODUCT_MASTER_NAME_EXIST = "PRODUCT_MASTER_NAME_EXIST";
                /*** 請填選是否可視*/
                public static final String VIEW_STATUS_EMPTY = "VIEW_STATUS_EMPTY";
                /*** 產品主表修改失敗*/
                public static final String PRODUCT_MASTER_ENTITY_UPDATE_ERROR = "PRODUCT_MASTER_ENTITY_UPDATE_ERROR";
                /**
                 * 同型號產品已存在
                 */
                public static final String PRODUCT_MASTER_ENTITY_ALREADY_EXISTS = "PRODUCT_MASTER_ENTITY_ALREADY_EXISTS";
                /*** 產品價格保存失敗*/
                public static final String PRODUCT_PRICE_ENTITY_SAVE_ERROR = "PRODUCT_PRICE_ENTITY_SAVE_ERROR";
                /*** 產品信息保存失敗*/
                public static final String PRODUCT_MASTER_ENTITY_SAVE_ERROR = "PRODUCT_MASTER_ENTITY_SAVE_ERROR";
                /*** 產品種類編碼為空*/
                public static final String PRODUCT_KIND_CODE_EMPTY = "PRODUCT_KIND_CODE_EMPTY";
                /*** 產品狀態修改失敗*/
                public static final String PRODUCT_MASTER_STATUS_UPDATE_ERROR = "PRODUCT_MASTER_STATUS_UPDATE_ERROR";
                /*** 產品ID為空*/
                public static final String PRODUCT_MASTER_ID_EMPTY = "PRODUCT_MASTER_ID_EMPTY";
                /*** 請選擇貨幣*/
                public static final String PRODUCT_MASTER_PRICE_EMPTY = "PRODUCT_MASTER_PRICE_EMPTY";
                /*** 對應價格不存在*/
                public static final String PRODUCT_MASTER_PRICE_IS_NULL = "PRODUCT_MASTER_PRICE_IS_NULL";
                /*** 新增產品規格參數有誤，請重新輸入*/
                public static final String PRODUCT_SPECIFICATION_SAVE_PARAM_ERROR = "PRODUCT_SPECIFICATION_SAVE_PARAM_ERROR";
                /*** 新增產品規格錯誤，請重試*/
                public static final String PRODUCT_SPECIFICATION_SAVE_ERROR = "PRODUCT_SPECIFICATION_SAVE_ERROR";
                /*** 產品規格名稱已存在，請重新輸入*/
                public static final String PRODUCT_SPECIFICATION_NAME_EXIST = "PRODUCT_SPECIFICATION_NAME_EXIST";
                /*** 修改狀態產品規格參數有誤，請重新輸入*/
                public static final String PRODUCT_SPECIFICATION_EDIT_STATUS_PARAM_ERROR = "PRODUCT_SPECIFICATION_EDIT_STATUS_PARAM_ERROR";
                /*** 修改狀態產品規格錯誤，請重試*/
                public static final String PRODUCT_SPECIFICATION_EDIT_STATUS_ERROR = "PRODUCT_SPECIFICATION_EDIT_STATUS_ERROR";
                /*** 修改產品規格參數有誤，請重新輸入*/
                public static final String PRODUCT_SPECIFICATION_EDIT_PARAM_ERROR = "PRODUCT_SPECIFICATION_EDIT_PARAM_ERROR";
                /*** 修改產品規格錯誤，請重試*/
                public static final String PRODUCT_SPECIFICATION_EDIT_ERROR = "PRODUCT_SPECIFICATION_EDIT_ERROR";
                /*** 刪除產品規格參數有誤，請重新輸入*/
                public static final String PRODUCT_SPECIFICATION_DELETE_PARAM_ERROR = "PRODUCT_SPECIFICATION_DELETE_PARAM_ERROR";
                /*** 刪除產品規格錯誤，請重試*/
                public static final String PRODUCT_SPECIFICATION_DELETE_ERROR = "PRODUCT_SPECIFICATION_DELETE_ERROR";
                /*** 刪除產品規格存在關聯*/
                public static final String PRODUCT_SPECIFICATION_DELETE_CATEGORY_ERROR = "PRODUCT_SPECIFICATION_DELETE_CATEGORY_ERROR";
                /*** 刪除產品規格存在關聯*/
                public static final String PRODUCT_SPECIFICATION_DELETE_VERSION_ERROR = "PRODUCT_SPECIFICATION_DELETE_VERSION_ERROR";
                /*** 查詢詳細產品規格參數有誤，請重新輸入*/
                public static final String PRODUCT_SPECIFICATION_INFO_ERROR = "PRODUCT_SPECIFICATION_INFO_ERROR";

                /*** 產品類別規格參數失敗，請重新輸入*/
                public static final String PRODUCT_CATEGORY_SPECIFICATION_EDIT_PARAM_ERROR = "PRODUCT_CATEGORY_SPECIFICATION_EDIT_PARAM_ERROR";
                /*** 產品類別規格錯誤，請重試*/
                public static final String PRODUCT_CATEGORY_SPECIFICATION_EDIT_ERROR = "PRODUCT_CATEGORY_SPECIFICATION_EDIT_ERROR";
                /*** 查询產品類別規格參數失敗，請重新輸入*/
                public static final String PRODUCT_CATEGORY_SPECIFICATION_LIST_PARAM_ERROR = "PRODUCT_CATEGORY_SPECIFICATION_LIST_PARAM_ERROR";

                /*** 產品版本規格錯誤，請重試*/
                public static final String PRODUCT_VERSION_SPECIFICATION_EDIT_ERROR = "PRODUCT_VERSION_SPECIFICATION_EDIT_ERROR";
                /*** 產品版本規格參數失敗，請重新輸入*/
                public static final String PRODUCT_VERSION_SPECIFICATION_EDIT_PARAM_ERROR = "PRODUCT_VERSION_SPECIFICATION_EDIT_PARAM_ERROR";

                /*** 查询產品版本規格參數失敗，請重新輸入*/
                public static final String PRODUCT_VERSION_SPECIFICATION_LIST_PARAM_ERROR = "PRODUCT_VERSION_SPECIFICATION_LIST_PARAM_ERROR";

                /*** 新增產品版本參數有誤，請重新輸入*/
                public static final String PRODUCT_VERSION_SAVE_PARAM_ERROR = "PRODUCT_VERSION_SAVE_PARAM_ERROR";
                /*** 新增產品版本參數失敗，請重試*/
                public static final String PRODUCT_VERSION_SAVE_ERROR = "PRODUCT_VERSION_SAVE_ERROR";
                /*** 產品版本名稱已存在，請重新輸入*/
                public static final String PRODUCT_VERSION_NAME_EXIST = "PRODUCT_VERSION_NAME_EXIST";
                /*** 修改產品版本狀態參數有誤，請重新輸入*/
                public static final String PRODUCT_VERSION_EDIT_STATUS_PARAM_ERROR = "PRODUCT_VERSION_EDIT_STATUS_PARAM_ERROR";
                /*** 修改產品版本狀態失敗，請重試*/
                public static final String PRODUCT_VERSION_EDIT_STATUS_ERROR = "PRODUCT_VERSION_EDIT_STATUS_ERROR";
                /*** 修改產品版本參數有誤，請重新輸入*/
                public static final String PRODUCT_VERSION_EDIT_PARAM_ERROR = "PRODUCT_VERSION_EDIT_PARAM_ERROR";
                /*** 修改產品版本失敗，請重試*/
                public static final String PRODUCT_VERSION_EDIT_ERROR = "PRODUCT_VERSION_EDIT_ERROR";
                /*** 刪除產品版本參數有誤，請重新輸入*/
                public static final String PRODUCT_VERSION_DELETE_PARAM_ERROR = "PRODUCT_VERSION_DELETE_PARAM_ERROR";
                /*** 刪除產品版本失敗，請重試*/
                public static final String PRODUCT_VERSION_DELETE_ERROR = "PRODUCT_VERSION_DELETE_ERROR";
                /*** 分頁查詢產品版本失敗，請重試*/
                public static final String PRODUCT_VERSION_PAGE_ERROR = "PRODUCT_VERSION_PAGE_ERROR";
                /*** 查詢詳細產品版本失敗，請重試*/
                public static final String PRODUCT_VERSION_INFO_ERROR = "PRODUCT_VERSION_INFO_ERROR";
                /*** 列表查詢產品版本失敗，請重試*/
                public static final String PRODUCT_VERSION_LIST_ERROR = "PRODUCT_VERSION_LIST_ERROR";


                /*** 新增產品綫參數有誤，請重新輸入*/
                public static final String PRODUCT_LINE_SAVE_PARAM_ERROR = "PRODUCT_LINE_SAVE_PARAM_ERROR";
                /*** 產品綫名稱已存在，請重新輸入*/
                public static final String PRODUCT_LINE_PARAM_NAME_EXIST = "PRODUCT_LINE_PARAM_NAME_EXIST";
                /*** 新增產品綫失敗，請重新輸入*/
                public static final String PRODUCT_LINE_SAVE_ERROR = "PRODUCT_LINE_SAVE_ERROR";
                /*** 修改產品綫狀態參數有誤，請重新輸入*/
                public static final String PRODUCT_LINE_EDIT_STATUS_PARAM_ERROR = "PRODUCT_LINE_EDIT_STATUS_PARAM_ERROR";
                /*** 修改產品綫狀態有誤，請重新輸入*/
                public static final String PRODUCT_LINE_EDIT_STATUS_ERROR = "PRODUCT_LINE_EDIT_STATUS_ERROR";
                /*** 產品綫詳情參數有誤，請重新輸入*/
                public static final String PRODUCT_LINE_INFO_PARAM_ERROR = "PRODUCT_LINE_INFO_PARAM_ERROR";
                /*** 產品綫刪除參數有誤，請重新輸入*/
                public static final String PRODUCT_LINE_DELETE_PARAM_ERROR = "PRODUCT_LINE_DELETE_PARAM_ERROR";
                /*** 產品綫刪除有誤，請重新輸入*/
                public static final String PRODUCT_LINE_DELETE_ERROR = "PRODUCT_LINE_DELETE_ERROR";
                /*** 產品綫修改參數有誤，請重新輸入*/
                public static final String PRODUCT_LINE_EDIT_PARAM_ERROR = "PRODUCT_LINE_EDIT_PARAM_ERROR";
                /*** 產品綫修改有誤，請重新輸入*/
                public static final String PRODUCT_LINE_EDIT_ERROR = "PRODUCT_LINE_EDIT_ERROR";
                /*** 產品綫刪除有誤，有產品類別擁有產品綫，請重新輸入*/
                public static final String PRODUCT_LINE_DELETE_CATEGORY_ERROR = "PRODUCT_LINE_DELETE_CATEGORY_ERROR";

                /*** 新增產品類別參數有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_SAVE_PARAM_ERROR = "PRODUCT_CATEGORY_SAVE_PARAM_ERROR";
                /*** 新增產品類別失敗，請重新輸入*/
                public static final String PRODUCT_CATEGORY_SAVE_ERROR = "PRODUCT_CATEGORY_SAVE_ERROR";
                /*** 產品類別名稱已存在，請重新輸入*/
                public static final String PRODUCT_CATEGORY_NAME_EXIST = "PRODUCT_CATEGORY_NAME_EXIST";
                /*** 修改產品類別狀態參數有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_EDIT_STATUS_PARAM_ERROR = "PRODUCT_CATEGORY_EDIT_STATUS_PARAM_ERROR";
                /*** 修改產品類別狀態有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_EDIT_STATUS_ERROR = "PRODUCT_CATEGORY_EDIT_STATUS_ERROR";
                /*** 產品類別詳情參數有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_INFO_PARAM_ERROR = "PRODUCT_CATEGORY_INFO_PARAM_ERROR";
                /*** 產品類別刪除參數有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_DELETE_PARAM_ERROR = "PRODUCT_CATEGORY_DELETE_PARAM_ERROR";
                /*** 產品類別刪除有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_DELETE_ERROR = "PRODUCT_CATEGORY_DELETE_ERROR";
                /*** 產品類別修改參數有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_EDIT_PARAM_ERROR = "PRODUCT_CATEGORY_EDIT_PARAM_ERROR";
                /*** 產品類別修改有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_EDIT_ERROR = "PRODUCT_CATEGORY_EDIT_ERROR";
                /*** 產品類別刪除有誤，有產品模型擁有產品類別，請重新輸入*/
                public static final String PRODUCT_CATEGORY_DELETE_MODEL_ERROR = "PRODUCT_CATEGORY_DELETE_MODEL_ERROR";


                /*** 新增產品功能參數有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_SAVE_PARAM_ERROR = "PRODUCT_FUNCTION_SAVE_PARAM_ERROR";
                /*** 新增產品功能失敗，請重新輸入*/
                public static final String PRODUCT_FUNCTION_SAVE_ERROR = "PRODUCT_FUNCTION_SAVE_ERROR";
                /*** 產品功能名稱已存在，請重新輸入*/
                public static final String PRODUCT_FUNCTION_NAME_EXIST = "PRODUCT_FUNCTION_NAME_EXIST";
                /*** 修改產品功能狀態參數有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_EDIT_STATUS_PARAM_ERROR = "PRODUCT_FUNCTION_EDIT_STATUS_PARAM_ERROR";
                /*** 修改產品功能狀態有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_EDIT_STATUS_ERROR = "PRODUCT_FUNCTION_EDIT_STATUS_ERROR";
                /*** 產品功能詳情參數有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_INFO_PARAM_ERROR = "PRODUCT_FUNCTION_INFO_PARAM_ERROR";
                /*** 產品功能刪除參數有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_DELETE_PARAM_ERROR = "PRODUCT_FUNCTION_DELETE_PARAM_ERROR";
                /*** 產品功能刪除有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_DELETE_ERROR = "PRODUCT_FUNCTION_DELETE_ERROR";
                /*** 產品功能修改參數有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_EDIT_PARAM_ERROR = "PRODUCT_FUNCTION_EDIT_PARAM_ERROR";
                /*** 產品功能修改有誤，請重新輸入*/
                public static final String PRODUCT_FUNCTION_EDIT_ERROR = "PRODUCT_FUNCTION_EDIT_ERROR";
                /*** 產品類別刪除有誤，有產品類別擁有產品功能，請重新輸入*/
                public static final String PRODUCT_FUNCTION_DELETE_CATEGORY_ERROR = "PRODUCT_FUNCTION_DELETE_CATEGORY_ERROR";
                /*** 產品功能刪除有誤，有產品版本擁有產品功能，請重新輸入*/
                public static final String PRODUCT_FUNCTION_DELETE_VERSION_ERROR = "PRODUCT_FUNCTION_DELETE_VERSION_ERROR";

                /*** 新增產品類別功能參數有誤，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_PARAM_ERROR = "PRODUCT_CATEGORY_FUNCTION_EDIT_PARAM_ERROR";
                /*** 新增產品類別功能參數失敗，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_ERROR = "PRODUCT_CATEGORY_FUNCTION_EDIT_ERROR";
                /*** 新增產品類別功能參數有誤，產品類別不存在，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_CATEGORY_NULL = "PRODUCT_CATEGORY_FUNCTION_EDIT_CATEGORY_NULL";
                /*** 新增產品類別功能參數失敗，產品功能不存在，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_FUNCTION_NULL = "PRODUCT_CATEGORY_FUNCTION_EDIT_FUNCTION_NULL";
                /*** 新增產品類別功能參數失敗,產品類別功能以存在，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_EDIT_IS_EXIST = "PRODUCT_CATEGORY_FUNCTION_EDIT_IS_EXIST";
                /*** 刪除產品類別功能參數失敗，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_DELETE_PARAM_ERROR = "PRODUCT_CATEGORY_FUNCTION_DELETE_PARAM_ERROR";
                /*** 查询產品類別功能列表參數失敗，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_LIST_PARAM_ERROR = "PRODUCT_CATEGORY_FUNCTION_LIST_PARAM_ERROR";
                /*** 刪除產品類別功能參數失敗，請重新輸入*/
                public static final String PRODUCT_CATEGORY_FUNCTION_DELETE_ERROR = "PRODUCT_CATEGORY_FUNCTION_DELETE_ERROR";

                /*** 新增模型類別參數有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_SAVE_PARAM_ERROR = "PRODUCT_MODEL_SAVE_PARAM_ERROR";
                /*** 新增模型類別失敗，請重新輸入*/
                public static final String PRODUCT_MODEL_SAVE_ERROR = "PRODUCT_MODEL_SAVE_ERROR";
                /*** 產品模型名稱已存在，請重新輸入*/
                public static final String PRODUCT_MODEL_NAME_EXIST = "PRODUCT_MODEL_NAME_EXIST";
                /*** 修改模型類別狀態參數有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_EDIT_STATUS_PARAM_ERROR = "PRODUCT_MODEL_EDIT_STATUS_PARAM_ERROR";
                /*** 修改模型類別狀態有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_EDIT_STATUS_ERROR = "PRODUCT_MODEL_EDIT_STATUS_ERROR";
                /*** 模型類別詳情參數有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_INFO_PARAM_ERROR = "PRODUCT_MODEL_INFO_PARAM_ERROR";
                /*** 模型類別刪除參數有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_DELETE_PARAM_ERROR = "PRODUCT_MODEL_DELETE_PARAM_ERROR";
                /*** 模型類別刪除有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_DELETE_ERROR = "PRODUCT_MODEL_DELETE_ERROR";
                /*** 模型類別修改參數有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_EDIT_PARAM_ERROR = "PRODUCT_MODEL_EDIT_PARAM_ERROR";
                /*** 模型類別修改有誤，請重新輸入*/
                public static final String PRODUCT_MODEL_EDIT_ERROR = "PRODUCT_MODEL_EDIT_ERROR";
                /*** 模型類別刪除有誤，有模型模型擁有模型類別，請重新輸入*/
                public static final String PRODUCT_MODEL_DELETE_VERSION_ERROR = "PRODUCT_MODEL_DELETE_VERSION_ERROR";


                /*** 查询產品版本功能相關列表參數失敗，請重新輸入*/
                public static final String PRODUCT_VERSION_FUNCTIONALITY_RELATED_LIST_PARAM_ERROR = "PRODUCT_VERSION_FUNCTIONALITY_RELATED_LIST_PARAM_ERROR";
                /*** 修改產品版本功能失敗，請重新輸入*/
                public static final String PRODUCT_VERSION_FUNCTIONALITY_RELATED_FUNCTION_INSERT_ERROR = "PRODUCT_VERSION_FUNCTIONALITY_RELATED_FUNCTION_INSERT_ERROR";
            }

            public static class BlogMessage {
                /*** BLOG主檔讯息查询失败，請确认*/
                public static final String BLOG_MASTER_SELECT_ERROR = "BLOG_MASTER_SELECT_ERROR";
                /*** BLOG主檔讯息保存失败，請确认*/
                public static final String BLOG_MASTER_SAVE_ERROR = "BLOG_MASTER_SAVE_ERROR";
                /*** BLOG内容讯息保存失败，請确认*/
                public static final String BLOG_CONTENT_SAVE_ERROR = "BLOG_CONTENT_SAVE_ERROR";
                /*** BLOG標簽讯息保存失败，請确认*/
                public static final String BLOG_TAG_SAVE_ERROR = "BLOG_TAG_SAVE_ERROR";
                /*** BLOG主檔讯息修改失败，請确认*/
                public static final String BLOG_MASTER_UPDATE_ERROR = "BLOG_MASTER_UPDATE_ERROR";
                /*** BLOG内容讯息保存失败，請确认*/
                public static final String BLOG_CONTENT_UPDATE_ERROR = "BLOG_CONTENT_UPDATE_ERROR";
                /*** BLOG歸屬機構修改失败，請确认*/
                public static final String BLOG_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR = "BLOG_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR";
                /*** BLOG主檔排序重複，請确认*/
                public static final String BLOG_MASTER_SORT_ERROR = "BLOG_MASTER_SORT_ERROR";
                /*** BLOG主檔狀態修改有誤，請确认*/
                public static final String BLOG_MASTER_EDIT_STATUS_ERROR = "BLOG_MASTER_EDIT_STATUS_ERROR";
                /*** BLOG主檔狀態查詢有誤，請确认*/
                public static final String BLOG_MASTER_EDIT_STATUS_SELECT_ERROR = "BLOG_MASTER_EDIT_STATUS_SELECT_ERROR";
                /*** BLOG主檔狀態參數有誤，請确认*/
                public static final String BLOG_MASTER_EDIT_STATUS_PARAMS_ERROR = "BLOG_MASTER_EDIT_STATUS_PARAMS_ERROR";
            }

            public static class TagMessage {
                /*** Tag新增參數錯誤，請确认*/
                public static final String TAG_INSERT_PARAM_ERROR = "TAG_INSERT_PARAM_ERROR";
                /*** Tag新增键值不能为空*/
                public static final String TAG_INSERT_KEY_NULL = "TAG_INSERT_KEY_NULL";
                /*** Tag新增名稱不能为空*/
                public static final String TAG_INSERT_NAME_NULL = "TAG_INSERT_NAME_NULL";
                /*** Tag新增國際化語言内容不能为空*/
                public static final String TAG_INSERT_LANGUAGE_CONSTANT_NULL = "TAG_INSERT_LANGUAGE_CONSTANT_NULL";
                /*** Tag修改键值不能为空*/
                public static final String TAG_UPDATE_KEY_NULL = "TAG_UPDATE_KEY_NULL";
                /*** Tag lang_type_id不能为空*/
                public static final String LANG_TYPE_ID_NULL = "LANG_TYPE_ID_NULL";
                /*** Tag新增錯誤，請确认*/
                public static final String TAG_INSERT_ERROR = "TAG_INSERT_ERROR";
                /*** Tag刪除錯誤，請确认*/
                public static final String TAG_DELETE_ERROR = "TAG_DELETE_ERROR";
                /*** Tag更新錯誤，請确认*/
                public static final String TAG_UPDATE_ERROR = "TAG_UPDATE_ERROR";
                /*** Tag查詢錯誤，請确认*/
                public static final String TAG_SELECT_ERROR = "TAG_SELECT_ERROR";
                /*** 符合條件的Tag不存在*/
                public static final String TAG_IS_NULL = "TAG_IS_NULL";
                /*** Tag修改ID不能爲空*/
                public static final String TAG_UPDATE_ID_NULL = "TAG_UPDATE_ID_NULL";
                /*** Tag修改名稱不能爲空*/
                public static final String TAG_UPDATE_NAME_NULL = "TAG_UPDATE_NAME_NULL";
                /*** Tag修改國際化語言内容不能爲空*/
                public static final String TAG_UPDATE_LANGUAGE_CONSTANT_NULL = "TAG_UPDATE_LANGUAGE_CONSTANT_NULL";
                /*** Tag修改參數錯誤*/
                public static final String TAG_UPDATE_PARAM_ERROR = "TAG_UPDATE_PARAM_ERROR";
            }

            public static class WebinarsMessage {
                /*** WEBINARS主檔讯息查询失败，請确认*/
                public static final String WEBINARS_MASTER_SELECT_ERROR = "WEBINARS_MASTER_SELECT_ERROR";
                /*** WEBINARS主檔讯息保存失败，請确认*/
                public static final String WEBINARS_MASTER_SAVE_ERROR = "WEBINARS_MASTER_SAVE_ERROR";
                /*** WEBINARS内容讯息保存失败，請确认*/
                public static final String WEBINARS_CONTENT_SAVE_ERROR = "WEBINARS_CONTENT_SAVE_ERROR";
                /*** WEBINARS標簽讯息保存失败，請确认*/
                public static final String WEBINARS_TAG_SAVE_ERROR = "WEBINARS_TAG_SAVE_ERROR";
                /*** WEBINARS主檔讯息修改失败，請确认*/
                public static final String WEBINARS_MASTER_UPDATE_ERROR = "WEBINARS_MASTER_UPDATE_ERROR";
                /*** WEBINARS内容讯息保存失败，請确认*/
                public static final String WEBINARS_CONTENT_UPDATE_ERROR = "WEBINARS_CONTENT_UPDATE_ERROR";
                /*** WEBINARS歸屬機構修改失败，請确认*/
                public static final String WEBINARS_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR = "WEBINARS_MASTER_AFFILIATED_BY_COMPANY_UPDATE_ERROR";
                /*** WEBINARS主檔排序重複，請确认*/
                public static final String WEBINARS_MASTER_SORT_ERROR = "WEBINARS_MASTER_SORT_ERROR";
                /*** WEBINARS主檔狀態修改有誤，請确认*/
                public static final String WEBINARS_MASTER_EDIT_STATUS_ERROR = "WEBINARS_MASTER_EDIT_STATUS_ERROR";
                /*** WEBINARS主檔狀態查詢有誤，請确认*/
                public static final String WEBINARS_MASTER_EDIT_STATUS_SELECT_ERROR = "WEBINARS_MASTER_EDIT_STATUS_SELECT_ERROR";
                /*** WEBINARS主檔狀態參數有誤，請确认*/
                public static final String WEBINARS_MASTER_EDIT_STATUS_PARAMS_ERROR = "WEBINARS_MASTER_EDIT_STATUS_PARAMS_ERROR";
                /*** WEBINARS標題不能爲空，請确认*/
                public static final String WEBINARS_TITLE_PARAM_ERROR = "WEBINARS_TITLE_PARAM_ERROR";
            }

            public static class EventsMessage {
                /*** EVENTS主檔讯息查询失败，請确认*/
                public static final String EVENTS_MASTER_SELECT_ERROR = "EVENTS_MASTER_SELECT_ERROR";
                /*** EVENTS主檔讯息保存失败，請确认*/
                public static final String EVENTS_MASTER_SAVE_ERROR = "EVENTS_MASTER_SAVE_ERROR";
                /*** EVENTS内容讯息保存失败，請确认*/
                public static final String EVENTS_CONTENT_SAVE_ERROR = "EVENTS_CONTENT_SAVE_ERROR";
                /*** EVENTS標簽讯息保存失败，請确认*/
                public static final String EVENTS_TAG_SAVE_ERROR = "EVENTS_TAG_SAVE_ERROR";
                /*** EVENTS主檔讯息修改失败，請确认*/
                public static final String EVENTS_MASTER_UPDATE_ERROR = "EVENTS_MASTER_UPDATE_ERROR";
                /*** EVENTS内容讯息保存失败，請确认*/
                public static final String EVENTS_CONTENT_UPDATE_ERROR = "EVENTS_CONTENT_UPDATE_ERROR";
                /*** EVENTS主檔狀態查詢有誤，請确认*/
                public static final String EVENTS_MASTER_EDIT_STATUS_SELECT_ERROR = "EVENTS_MASTER_EDIT_STATUS_SELECT_ERROR";
                /*** EVENTS主檔显示狀態參數有誤，請确认*/
                public static final String EVENTS_MASTER_EDIT_STATUS_PARAMS_ERROR = "EVENTS_MASTER_EDIT_STATUS_PARAMS_ERROR";
            }

            public static class NewsMessage {
                /*** NEWS主檔讯息查询失败，請确认*/
                public static final String NEWS_MASTER_SELECT_ERROR = "NEWS_MASTER_SELECT_ERROR";
                /*** NEWS主檔讯息保存失败，請确认*/
                public static final String NEWS_MASTER_SAVE_ERROR = "NEWS_MASTER_SAVE_ERROR";
                /*** NEWS内容讯息保存失败，請确认*/
                public static final String NEWS_CONTENT_SAVE_ERROR = "NEWS_CONTENT_SAVE_ERROR";
                /*** NEWS標簽讯息保存失败，請确认*/
                public static final String NEWS_TAG_SAVE_ERROR = "NEWS_TAG_SAVE_ERROR";
                /*** NEWS主檔讯息修改失败，請确认*/
                public static final String NEWS_MASTER_UPDATE_ERROR = "NEWS_MASTER_UPDATE_ERROR";
                /*** NEWS内容讯息保存失败，請确认*/
                public static final String NEWS_CONTENT_UPDATE_ERROR = "NEWS_CONTENT_UPDATE_ERROR";
                /*** NEWS主檔狀態查詢有誤，請确认*/
                public static final String NEWS_MASTER_EDIT_STATUS_SELECT_ERROR = "NEWS_MASTER_EDIT_STATUS_SELECT_ERROR";
                /*** NEWS主檔显示狀態參數有誤，請确认*/
                public static final String NEWS_MASTER_EDIT_STATUS_PARAMS_ERROR = "NEWS_MASTER_EDIT_STATUS_PARAMS_ERROR";
                /*** 請先創建英文的NEWS*/
                public static final String NEWS_MASTER_LANGUAGE_ERROR = "NEWS_MASTER_LANGUAGE_ERROR";
            }

            public static class ReleasesMessage {
                /*** RELEASES主檔讯息查询失败，請确认*/
                public static final String RELEASES_MASTER_SELECT_ERROR = "RELEASES_MASTER_SELECT_ERROR";
                /*** RELEASES主檔讯息保存失败，請确认*/
                public static final String RELEASES_MASTER_SAVE_ERROR = "RELEASES_MASTER_SAVE_ERROR";
                /*** RELEASES内容讯息保存失败，請确认*/
                public static final String RELEASES_CONTENT_SAVE_ERROR = "RELEASES_CONTENT_SAVE_ERROR";
                /*** RELEASES標簽讯息保存失败，請确认*/
                public static final String RELEASES_TAG_SAVE_ERROR = "RELEASES_TAG_SAVE_ERROR";
                /*** RELEASES主檔讯息修改失败，請确认*/
                public static final String RELEASES_MASTER_UPDATE_ERROR = "RELEASES_MASTER_UPDATE_ERROR";
                /*** RELEASES内容讯息保存失败，請确认*/
                public static final String RELEASES_CONTENT_UPDATE_ERROR = "RELEASES_CONTENT_UPDATE_ERROR";
                /*** RELEASES主檔狀態查詢有誤，請确认*/
                public static final String RELEASES_MASTER_EDIT_STATUS_SELECT_ERROR = "RELEASES_MASTER_EDIT_STATUS_SELECT_ERROR";
                /*** RELEASES主檔显示狀態參數有誤，請确认*/
                public static final String RELEASES_MASTER_EDIT_STATUS_PARAMS_ERROR = "RELEASES_MASTER_EDIT_STATUS_PARAMS_ERROR";
                /*** 請先創建英文的RELEASES*/
                public static final String RELEASES_MASTER_LANGUAGE_ERROR = "RELEASES_MASTER_LANGUAGE_ERROR";
            }

            public static class LeadershipMessage {
                /*** Leadership主檔讯息查询失败，請确认*/
                public static final String LEADERSHIP_MASTER_SELECT_ERROR = "LEADERSHIP_MASTER_SELECT_ERROR";
                /*** Leadership主檔讯息保存失败，請确认*/
                public static final String LEADERSHIP_MASTER_SAVE_ERROR = "LEADERSHIP_MASTER_SAVE_ERROR";
                /*** Leadership内容讯息保存失败，請确认*/
                public static final String LEADERSHIP_CONTENT_SAVE_ERROR = "LEADERSHIP_CONTENT_SAVE_ERROR";
                /*** Leadership標簽讯息保存失败，請确认*/
                public static final String LEADERSHIP_TAG_SAVE_ERROR = "LEADERSHIP_TAG_SAVE_ERROR";
                /*** Leadership主檔讯息修改失败，請确认*/
                public static final String LEADERSHIP_MASTER_UPDATE_ERROR = "LEADERSHIP_MASTER_UPDATE_ERROR";
                /*** Leadership内容讯息保存失败，請确认*/
                public static final String LEADERSHIP_CONTENT_UPDATE_ERROR = "LEADERSHIP_CONTENT_UPDATE_ERROR";
                /*** Leadership主檔狀態查詢有誤，請确认*/
                public static final String LEADERSHIP_MASTER_EDIT_STATUS_SELECT_ERROR = "LEADERSHIP_MASTER_EDIT_STATUS_SELECT_ERROR";
                /*** Leadership主檔显示狀態參數有誤，請确认*/
                public static final String LEADERSHIP_MASTER_EDIT_STATUS_PARAMS_ERROR = "LEADERSHIP_MASTER_EDIT_STATUS_PARAMS_ERROR";
            }

            public static class CertificationsMessage {
                /*** CERTIFICATIONS主檔讯息查询失败，請确认*/
                public static final String CERTIFICATIONS_MASTER_SELECT_ERROR = "CERTIFICATIONS_MASTER_SELECT_ERROR";
                /*** CERTIFICATIONS主檔讯息保存失败，請确认*/
                public static final String CERTIFICATIONS_MASTER_SAVE_ERROR = "CERTIFICATIONS_MASTER_SAVE_ERROR";
                /*** CERTIFICATIONS内容讯息保存失败，請确认*/
                public static final String CERTIFICATIONS_CONTENT_SAVE_ERROR = "CERTIFICATIONS_CONTENT_SAVE_ERROR";
                /*** CERTIFICATIONS標簽讯息保存失败，請确认*/
                public static final String CERTIFICATIONS_TAG_SAVE_ERROR = "CERTIFICATIONS_TAG_SAVE_ERROR";
                /*** CERTIFICATIONS主檔讯息修改失败，請确认*/
                public static final String CERTIFICATIONS_MASTER_UPDATE_ERROR = "CERTIFICATIONS_MASTER_UPDATE_ERROR";
                /*** CERTIFICATIONS内容讯息保存失败，請确认*/
                public static final String CERTIFICATIONS_CONTENT_UPDATE_ERROR = "CERTIFICATIONS_CONTENT_UPDATE_ERROR";
                /*** CERTIFICATIONS主檔狀態查詢有誤，請确认*/
                public static final String CERTIFICATIONS_MASTER_EDIT_STATUS_SELECT_ERROR = "CERTIFICATIONS_MASTER_EDIT_STATUS_SELECT_ERROR";
                /*** CERTIFICATIONS主檔显示狀態參數有誤，請确认*/
                public static final String CERTIFICATIONS_MASTER_EDIT_STATUS_PARAMS_ERROR = "CERTIFICATIONS_MASTER_EDIT_STATUS_PARAMS_ERROR";
            }

            public static class AgPortalMessage {
                /*** PORTAL_ID參數不能爲空*/
                public static final String PORTAL_ID_PARAMS_ERROR = "PORTAL_ID_PARAMS_ERROR";
                /*** 新增PORTAL失敗*/
                public static final String PORTAL_INSERT_ERROR = "PORTAL_INSERT_ERROR";
                /*** 狀態參數非法*/
                public static final String PORTAL_EDIT_STATUS_PARAMS_ERROR = "PORTAL_EDIT_STATUS_PARAMS_ERROR";
                /*** 展示參數非法*/
                public static final String PORTAL_EDIT_DISPLAY_PARAMS_ERROR = "PORTAL_EDIT_DISPLAY_PARAMS_ERROR";
                /*** 此PORTAL_ID不存在*/
                public static final String PORTAL_SELECT_ERROR = "PORTAL_SELECT_ERROR";
                /*** 修改狀態失敗*/
                public static final String PORTAL_EDIT_STATUS_ERROR = "PORTAL_EDIT_STATUS_ERROR";
                /*** 修改展示失敗*/
                public static final String PORTAL_EDIT_DISPLAY_ERROR = "PORTAL_EDIT_DISPLAY_ERROR";
                /*** 更新PORTAL失敗*/
                public static final String PORTAL_UPDATE_ERROR = "PORTAL_UPDATE_ERROR";
                /*** 刪除PORTAL失敗*/
                public static final String PORTAL_DELETE_ERROR = "PORTAL_DELETE_ERROR";
            }

            public static class StageMessage {
                /*** 請先刪除此文件再進行上傳 */
                public static final String ERROR_01 = "ERROR_01";
                /*** 缺少參數：請選擇PathType*/
                public static final String ERROR_02 = "ERROR_02";
                /*** 缺少參數：請選擇locationType*/
                public static final String ERROR_03 = "ERROR_03";
                /*** 缺少參數：stageId*/
                public static final String ERROR_04 = "ERROR_04";
                /*** 缺少參數：langType*/
                public static final String ERROR_05 = "ERROR_05";
                /*** 文件上傳中,暫時不可操作*/
                public static final String ERROR_06 = "ERROR_06";
                /*** 文件上傳路徑表參數異常，請檢查文件上傳參數設定*/
                public static final String COMMON_UPLOAD_PATH_ERROR = "COMMON_UPLOAD_PATH_ERROR";
                /*** 參數異常，請選擇路徑分類*/
                public static final String COMMON_UPLOAD_PATH_TYPE_EMPTY = "COMMON_UPLOAD_PATH_TYPE_EMPTY";
                /*** 參數異常，請輸入目錄路徑*/
                public static final String COMMON_UPLOAD_DIRECTORY_PATH_EMPTY = "COMMON_UPLOAD_DIRECTORY_PATH_EMPTY";
                /*** 參數異常，請選擇管道*/
                public static final String COMMON_UPLOAD_LOCATION_TYPE_EMPTY = "COMMON_UPLOAD_LOCATION_TYPE_EMPTY";
                /*** 該類型的管道參數已經維護過，請前往修改*/
                public static final String COMMON_UPLOAD_PATH_SETTING_EXIST = "COMMON_UPLOAD_PATH_SETTING_EXIST";
                /*** 參數異常，請選擇SettingCode*/
                public static final String COMMON_UPLOAD_PATH_SETTING_SETTING_CODE_EMPTY = "COMMON_UPLOAD_PATH_SETTING_SETTING_CODE_EMPTY";
                /*** 修改STAGE_FILE表失败：缺少参数FILE_STATUS*/
                public static final String STAGE_FILE_STATUS_EMPTY = "STAGE_FILE_STATUS_EMPTY";

                public static final String STAGE_ID_NOT_EXIST = "stage_id_not_exist";
            }

            public static class CareersMessage {
                /*** Careers新增錯誤，請确认*/
                public static final String CAREERS_INSERT_ERROR = "CAREERS_INSERT_ERROR";
                /*** Careers内容讯息保存失败，請确认*/
                public static final String CAREERS_CONTENT_SAVE_ERROR = "CAREERS_CONTENT_SAVE_ERROR";
                /*** Careers標簽讯息保存失败，請确认*/
                public static final String CAREERS_TAG_SAVE_ERROR = "CAREERS_TAG_SAVE_ERROR";
                /*** Careers主檔讯息查询失败，請确认*/
                public static final String CAREERS_MASTER_SELECT_ERROR = "CAREERS_MASTER_SELECT_ERROR";
                /*** Careers主檔讯息修改失败，請确认*/
                public static final String CAREERS_MASTER_UPDATE_ERROR = "CAREERS_MASTER_UPDATE_ERROR";
                /*** Careers内容讯息保存失败，請确认*/
                public static final String CAREERS_CONTENT_UPDATE_ERROR = "CAREERS_CONTENT_UPDATE_ERROR";
                /*** CAREERS_ID參數不能爲空*/
                public static final String CAREERS_ID_PARAMS_ERROR = "CAREERS_ID_PARAMS_ERROR";
                /*** 狀態參數非法*/
                public static final String CAREERS_EDIT_STATUS_PARAMS_ERROR = "CAREERS_EDIT_STATUS_PARAMS_ERROR";
                /*** 此CAREERS_ID不存在*/
                public static final String CAREERS_SELECT_ERROR = "CAREERS_SELECT_ERROR";
                /*** 修改狀態失敗*/
                public static final String CAREERS_EDIT_STATUS_ERROR = "CAREERS_EDIT_STATUS_ERROR";
            }

            public static class LdapLoginMessage {
                /*** 驗證失敗，請重新輸入帳號密碼*/
                public static final String LDAP_ACCOUNT_ERROR = "LDAP_ACCOUNT_ERROR";
                /*** LDAP鏈接失敗*/
                public static final String LDAP_LINK_ERROR = "LDAP_LINK_ERROR";
                /*** LDAP登錄失敗*/
                public static final String LDAP_LOGIN_ERROR = "LDAP_LOGIN_ERROR";

            }

            public static class SysCommonParamSettingMessage {
                /*** 項目名稱為空*/
                public static final String PROJECT_NAME_EMPTY = "PROJECT_NAME_EMPTY";
                /*** 參數名稱為空*/
                public static final String PARAM_NAME_EMPTY = "PARAM_NAME_EMPTY";
                /*** 参数值為空*/
                public static final String PARAM_VALUE_EMPTY = "PARAM_VALUE_EMPTY";
                /*** 當前參數已存在該項目中*/
                public static final String THIS_DATA_ALREADY_EXISTS = "THIS_DATA_ALREADY_EXISTS";
                /*** 系統參數配置保存失敗*/
                public static final String COMMON_PARAM_SETTING_ENTITY_SAVE_ERROR = "COMMON_PARAM_SETTING_ENTITY_SAVE_ERROR";
                /*** 系統參數配置修改失敗*/
                public static final String COMMON_PARAM_SETTING_ENTITY_UPDATE_ERROR = "COMMON_PARAM_SETTING_ENTITY_UPDATE_ERROR";
                /*** 系統參數配置刪除失敗*/
                public static final String COMMON_PARAM_SETTING_ENTITY_DELETE_ERROR = "COMMON_PARAM_SETTING_ENTITY_DELETE_ERROR";
                /*** 系統參數配置獲取失敗*/
                public static final String COMMON_PARAM_SETTING_ENTITY_GET_ERROR = "COMMON_PARAM_SETTING_ENTITY_GET_ERROR";
            }

            public static class OrderMessage {
                /*** 訂單編號爲空，請重新輸入*/
                public static final String ORDER_NUMBER_NULL = "ORDER_NUMBER_NULL";
                /*** 該賬單還沒有收據，請確認付款*/
                public static final String ORDER_INVOICE_IS_NULL = "ORDER_INVOICE_IS_NULL";
                /*** 客戶編號爲空，請確認*/
                public static final String ORDER_MASTER_CUSTOMER_CODE_EMPTY = "ORDER_MASTER_CUSTOMER_CODE_EMPTY";
                /*** 請輸入有效起始日期*/
                public static final String ORDER_MASTER_VALID_FROM_EMPTY = "ORDER_MASTER_VALID_FROM_EMPTY";
                        }
                    }
                }
            }
        }
    }
}


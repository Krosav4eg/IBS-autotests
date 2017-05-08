package utils;

/**
 * Created by Sergey_Potapov
 */
public class Constants {
    //========================LOGIN PAGES=============================================
    public static final String LOGIN_FIELD = "userID";
    public static final String PASSWORD_FIELD = "password";
    public static final String AUTHORIZATION_BUTTON = "//input[@value='Log in']";

    //========================ROLE INDICATORS=============================================
    public static final String CONTENT_OPERATOR_ROLE_INDICATOR = "//li[contains(text(),'Оператор Контента ДБН')]";
    public static final String ANALITIC_ROLE_INDICATOR = "//li[contains(text(),'Аналитик ЦА ДБН')]";
    public static final String COORDINATOR_ROLE_INDICATOR = "//li[contains(text(),'Координатор ДБН')]";

    //========================MAIN PAGES=============================================
    public static final String MAIN_PAGE = "//a[contains(text(),'Главная страница')]";
    public static final String ORG_LEVEL_BLOCK = "(//fieldset[@class='fpspm-simple-fieldset'])[1]";
    public static final String THEME_RUBRIC_BLOCK = "(//fieldset[@class='fpspm-simple-fieldset'])[2]";
    public static final String TEST_DATA_RIGHT_SECTION = "//div[@class='ui-datagrid-content ui-widget-content ui-datagrid-col-1']";
    public static final String CREATED_RUBRIC_ASSERTION = "//div/a[contains(text(),'Autotest')]";
    //========================
    public static final String DATE_OF_SIGNATURE_NEWCREATED_RUBRIC = "(//div[contains(text(),'03.05.2017')])[1]";
    public static final String PUBLISED_NEWCREATED_RUBRIC = "(//div[contains(text(),'03.05.2017')])[2]";
    public static final String PUBLISED_NEWCREATED_AUTHOR = "//div[contains(text(),'Sergey')]";
    public static final String PUBLISED_PERSON_NEWCREATED_RUBRIC = "//div[contains(text(),'ДБН dbn_content_operator')]";
    public static final String PUBLISED_PERSON_NEWCREATED_RUBRIC_FOR_ANALITIC = "//div[contains(text(),'ДБН dbn_analyst_ca')]";
    public static final String BR = "//div[contains(text(),'Материалы для ГУП')]";
    public static final String MI = "//div[contains(text(),'Волго-Вятская МИ')]";
    public static final String RUBRICS = "//div[contains(text(),'Рубрика')]";
    public static final String TEMPLATE_BUTTON = "//i[@class='fa fa-clipboard fa-lg']";
    public static final String EDIT_BUTTON = "//i[@class='fa fa-pencil-square-o fa-lg']";
    public static final String DELETE_BUTTON = "//i[@class='fa fa-trash fa-lg']";
    public static final String DELETE_NEW_RUBRIC_BUTTON = "//button/span[contains(text(),'OK')]";

    //========================Publication PAGE=============================================
    public static final String PUBLISHING_PAGE = "//a[contains(text(),'Публикация')]";
    //========================
    public static final String NAME_OF_MATERIAL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[1]";
    public static final String NAME_OF_MATERIAL_INPUT_FIELD = "//input[@name='name']";
    //========================
    public static final String REQUISITE_OF_MATERIAL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[2]";
    public static final String AUTHOR_INPUT_FIELD = "//input[@name='authorDoc']";
    public static final String DATE_OF_SIGNATURE = "//input[@name='dateSign']";
    //========================
    public static final String RUBRICATOR_OF_ORG_LEVEL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[3]";
    public static final String SELECT_ORG_OBJECTS = "(//span[contains(text(),'Выбрать организационные объекты')])[1]";
    //========================
    public static final String EXCHANGE_OF_MATERIALS_IN_BANK_OF_RUSSIA = "//a[contains(text(),'Обмен материалами в Банке России')]";
    public static final String MATERIALS_FOR_GROUP = "(//tr/td[2]/button[@title='Добавить'])[1]";
    public static final String BR_DISPLAYED_IN_TABLE = "//tr/td[3][contains(text(),'Материалы для ГУП')]";
    public static final String BR_DISPLAYED_CHECKBOX_IN_TABLE = "(//input[@name='checked'])[1]";

    //========================
    public static final String TU_BANK_OF_RUSSIA_TAB = "//a[contains(text(),'ТУ Банка России')]";
    public static final String VOLGO_VIATSKA_MI = "(//tr/td[3]/button[@class='fpspm-button'])[1]";
    public static final String MI_DISPLAYED_IN_TABLE = "//tr/td[3][contains(text(),'МИ по Дальневосточному ФО')]";
    public static final String VOLGO_VIATSKA_MI_DISPLAYED_IN_TABLE = "//tr/td[2][contains(text(),'МИ по Дальневосточному ФО')]";
    //========================
    public static final String MI_DISPLAYED_CHECKBOX_IN_TABLE = "//tr/td[2][contains(text(),'Материалы для ГУП')]";
    //========================
    public static final String CREDIT_ORGANIZATIONS_OF_BANK_RUSSIA = "//a[contains(text(),'Кредитные организации Банка России')]";
    public static final String TARUSA = "//tr[132]/td[3]/button";
    public static final String SAVE_ORG_TEMPLATE_BUTTON = "(//span[contains(text(), 'Сохранить')])[4]";
    //========================
    public static final String MATERIALS_FOR_GROUP_IS_DISPLAYED = "//tr/td[2][contains(text(),'Материалы для ГУП')]";
    public static final String MATERIALS_FOR_GROUP_IS_DISPLAYED_DELETE_BUTTON = "//tr/td[3]/div/button/i";
    //========================
    public static final String DESCRIPTION_OF_MATERIAL_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[4]";
    public static final String DESCRIPTION_OF_MATERIAL_INPUT_FIELD = "//textarea[@name='description']";
    //========================
    public static final String ATTACHED_FIELS_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[5]";
    public static final String ATTACHED_FIELS_DOWNLOAD_BUTTON = "//button[@name='uploadFilesBtn']";
    public static final String FIRST_UPLOADED_FILE_IS_DISPLAYING = "//input[@value='1.png']";
    public static final String SECOND_UPLOADED_FILE_IS_DISPLAYING = "//input[@value='Flow Git.docx']";
    public static final String THIRD_UPLOADED_FILE_IS_DISPLAYING = "//input[@value='Framework_Documentation.pdf']";
    public static final String FOURTH_UPLOADED_FILE_IS_DISPLAYING = "//input[@value='New Text Document.txt']";
    public static final String FIFTH_UPLOADED_FILE_IS_DISPLAYING = "//input[@value='New Text Document (2).txt']";
    //========================
    public static final String THEME_RUBRICATOR_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[6]";
    public static final String SELECT_THEME_RUBRICATOR_BUTTON = "//button[@data-field='chooseRubricBtn']";
    public static final String SELECT_RUBRICATOR_PLUS_BUTTON = "//tbody[@class='ui-treetable-data']//div[@class='fpspm-text-center']/button[@data-action='selectRubricNode']";
    public static final String SELECT_RUBRICATOR_DISPLAYED = "//tr/td[2][contains(text(),'Рубрика')]";
    public static final String SELECT_RUBRICATOR_SAVE = "(//button/span[contains(text(),'Сохранить')])[5]";
    public static final String SELECTED_RUBRICATOR_DISPLAYED = "//div/p[contains(text(),'Рубрика')]";
    public static final String TRASH_HOLDER_OF_SELECTED_RUBRICATOR_DISPLAYED = "//button[@data-action='removeSelectedRubrics']";
    //========================
    public static final String RELATED_MATERIALS_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[7]";
    public static final String RELATED_MATERIALS_TAB_INPUTFIELD = "//input[@name='materialId']";
    public static final String RELATED_MATERIALS_ADD_BUTTON = "//span[contains(text(),'Добавить')]";

    public static final String SERVICE_INFO_TAB = "(//fieldset[@class='fpspm-fieldset']/legend)[8]";
    //========================
    public static final String SAVE_PUBLICATION_BUTTON = "//button[1]/span[contains(text(),'Сохранить')]";

    //========================Requires Fields
    public static final String REQUIRE_FIELD_1 = "(//label[contains(text(),'Это поле необходимо заполнить.')])[1]";
    public static final String REQUIRE_FIELD_2 = "(//label[contains(text(),'Это поле необходимо заполнить.')])[2]";
    public static final String REQUIRE_FIELD_3 = "(//label[contains(text(),'Это поле необходимо заполнить.')])[3]";

    //========================Error prompts for fields
    public static final String ORG_OBJECT_PROMPT = "//ul[@class='fpspm-form-errors']/li[contains(text(),'Необходимо выбрать организационный объект')]";
    public static final String ATTACH_FIELS_PROMPT = "//ul[@class='fpspm-form-errors']/li[contains(text(),'Необходимо прикрепить файлы')]";
    public static final String NEED_TO_SELECT_THEME_RUBRIC_PROMPT = "//ul[@class='fpspm-form-errors']/li[contains(text(),'Необходимо выбрать тематическую рубрику')]";


    //========================THEME RUBRIC PAGE=============================================
    public static final String THEME_RUBRIC_PAGE = "//a[contains(text(),'Тематический рубрикатор')]";
    //===============================================
    public static final String ADD_BUTTON_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Добавить')])[1]";
    public static final String TRANSFER_BUTTON_ON_THEME_RUBRIC_PAGE = "//span[contains(text(),'Переместить')]";
    public static final String DELETE_RUBRIC_BUTTON = "//span[contains(text(),'Удалить')]";
    public static final String CHANGE_BUTTON_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Изменить')])[1]";
    //===============================================
    public static final String THEME_RUBRIC_TABLE = "//div[@class='ui-treetable-tablewrapper']";
    public static final String NAME_COLUMN_OF_TABLE = "//table/thead/tr/th[1]";
    public static final String DESCRIPTION_COLUMN_OF_TABLE = "//table/thead/tr/th[2]";

    public static final String CHANGE_WINDOW_TITLE_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Изменить')])[2]";
    public static final String DIALOG_ADD_WINDOW_ON_THEME_RUBRIC_PAGE = "(//span[contains(text(),'Добавить')])[2]";
    public static final String NAME_OF_RUBRIC_IN_DIALOG_ADD_WINDOW = "//input[@name='name']";
    public static final String DESCRIPTION_OF_RUBRIC_IN_DIALOG_ADD_WINDOW = "//textarea[@name='description']";
    public static final String SAVE_BUTTON_OF_RUBRIC_IN_DIALOG_ADD_WINDOW = "(//button[@type='button'])[6]";
    public static final String NEW_THEME_RUBRIC = "//span[contains(text(),'Новая Тестовая Рубрика')]";
    public static final String NEW_THEME_RUBRIC_AFTER_CHANGE = "(//tr/td/span[2])[1]";
    public static final String NEW_THEME_RUBRIC_AFTER_CHANGE_IN_THE_END_OF_LIST = "(//tr/td/span[2])[2]";
    public static final String DESCRIPTION_OF_THEME_RUBRIC = "//td[contains(text(),'Для автотестов')]";
    public static final String DESCRIPTION_OF_THEME_RUBRIC_AFTER_CHANGE = "//td[contains(text(),'Для новых автотестов')]";
    public static final String ACCEPT_DELETE_RUBRIC_BUTTON_IN_DIALOG_WINDOW = "//span[contains(text(),'OK')]";
    public static final String REQUIRED_FIELD_IN_ADD_NEW_RUBRIC_WINDOW = "//label[contains(text(), 'Это поле необходимо заполнить.')]";
    public static final String CLOSE_CHANGE_NEW_RUBRIC_WINDOW_BUTTON = "(//span[@class='fa fa-fw fa-close'])[1]";

    public static final String SAVE_BUTTON_IN_CHANGE_RUBRIC_WINDOW = "(//span[contains(text(),'Сохранить')])[1]";
    public static final String IN_THE_END_RADIO_BUTTON_IN_CHANGE_RUBRIC_WINDOW = "//input[@value='LAST']";
    public static final String SELECT_PARENT_IN_TRANSFER_WINDOW = "//span[@class='ui-treenode-icon fa fa-fw fa-folder fpspm-folder-icon']";
    public static final String SAVE_BUTTON_IN_TRANSFER_WINDOW = "(//span[contains(text(),'Сохранить')])[2]";
    public static final String PARENT_RUBRIC_IN_MAIN_PAGE_OF_THEME_RUBRIC_PAGE = "span.ui-treetable-toggler.fa.fa-fw.fa-caret-right.ui-c";
    public static final String NEW_ADDED_RUBRIC_IN_PARENT_RUBRIC = "(//span/i)[2]";


    //========================REPORT PAGE=============================================
    public static final String REPORTS_PAGE = "//a[contains(text(),'Отчеты')]";

    //========================MANAGEMENT OF ACCESS RIGHTS PAGE=============================================
    public static final String FPS_PM_TAB = "//a[contains(text(),'ФПС ПМ')]";
    public static final String MANAGEMENT_OF_ACCESS_RIGHTS = "//a[contains(text(),'Управление правами доступа')]";
    public static final String SEARCH_PARAMETERS_SECTION = "//div[@class='ui-grid-row fpspm-form-group ui-grid-col-8']";
    public static final String RESULTS_OF_SEARCH_TABLE = "//div[@class='fpspm-text-center ui-datatable ui-widget']";
    //========================
    public static final String INPUT_LAST_NAME_FIST_NAME_FIELD = "//input[@name='displayName']";
    public static final String INPUT_LOGIN_FIELD = "//input[@name='catalogUserId']";
    //========================
    public static final String USER_FIRST_NAME_LAST_NAME_IN_TABLE = "//div[@class='fpspm-text-center ui-datatable ui-widget']//tr/td[3]";
    public static final String USER_LOGIN_IN_IN_TABLE = "//div[@class='fpspm-text-center ui-datatable ui-widget']//tr/td[4]";
    public static final String DISPLAY_ONLY_CA_CHECKBOX = "//input[@type='checkbox']";
    //========================
    public static final String FOUNTED_USER_1_IN_TABLE = "(//tr/td[5])[1]";
    public static final String FOUNTED_USER_2_IN_TABLE = "(//tr/td[5])[2]";
    public static final String FOUNTED_USER_3_IN_TABLE = "(//tr/td[5])[3]";
    public static final String FOUNTED_USER_4_IN_TABLE = "(//tr/td[5])[4]";
    //========================
    public static final String UNCONFIRMED_ROLE_IN_TABLE = "(//i[@style='color: red;'])[1]";
    public static final String CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW = "(//div[@role='dialog'])[6]";
    public static final String CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_CHECKBOX = "//input[@name='confirmed']";
    public static final String CONFIRMATION_ROLE_FOR_USER_DIALOG_WINDOW_SAVE_BUTTON = "(//span[contains(text(), 'Сохранить')])[5]";
    public static final String CONFIRMED_ROLE_IN_TABLE = "(//i[@style='color: green;'])[2]";
    public static final String RUBRIC_ICON = "(//tr/td[8]/i)[2]";
    public static final String SELECT_RUBRIC_WINDOW = "(//div[@role='dialog'])[5]";
    public static final String SELECT_RUBRIC = "(//div[@role='dialog'])[5]//button[@data-action='selectRubricNode']";
    public static final String SELECT_RUBRIC_IS_DISPLAYED = "//tr/td[2][contains(text(),'Рубрика')]";

    public static final String SELECTED_RUBRIC_CHECKBOX1 = "//input[@name='checked']";

    public static final String DELETE_SELECTED_RUBRIC_BUTTON = "//span[contains(text(),'Удалить')]";
    public static final String NO_RECORDS_FOUND_MESSAGE = "//table//td[contains(text(),'No records found')]";
    public static final String SAVE_RUBRIC_BUTTON = "(//span[contains(text(),'Сохранить')])[4]";

    //========================MANAGEMENT OF ACCESS RIGHTS ROLE DROPDOWN FILTERS=============================================
    public static final String DROPDOWN_DEPARTMENT_BUTTON = "span.fa.fa-fw.fa-caret-down";
    public static final String DROPDOWN_ROLE_BUTTON = "(//span[@class='fa fa-fw fa-caret-down'])[2]";
    public static final String DROPDOWN_ALL_ROLE_BUTTON = "//li[@data-label='Все роли']";
    public static final String DROPDOWN_ROLE_CONTENT_OPERATOR_BUTTON = "//li[@data-label='Оператор контента']";
    public static final String DROPDOWN_ROLE_ANALITIC_BUTTON = "//li[@data-label='Аналитик']";


    //========================MANAGEMENT OF ACCESS RIGHTS DROPDOWN FILTERS=============================================
    public static final String ALL_DEPARTMENTS_FILTER = ".ui-dropdown-item.ui-corner-all";
    public static final String VOLGO_VJTSKAJ_MI_FILTER = "//li[@data-label='Волго-Вятская МИ']";
    public static final String VOLGO_VJTSKAJ_GU_OF_BANK_RUSSIA_FILTER = "//li[@data-label='Волго-Вятское ГУ Банка России']";
    public static final String GU_OF_BANK_RUSSIA_FILTER = "//li[@data-label='ГУ Банка России по Центральному федеральному округу']";
    public static final String GU_OF_MOSCOW_REGION = "//li[@data-label='ГУ Банка России по Центральному федеральному округу (Московский регион)']";
    public static final String DALNEVOSTOCHNOE_GU_OF_BANK_RUSSIA = "//li[@data-label='Дальневосточное ГУ Банка России']";
    public static final String MI_PO_DALNEVOSTOCHNOMU_FO = "//li[@data-label='МИ по Дальневосточному ФО']";
    public static final String MI_PO_SEVERO_ZAPADNOMU_FO = "//li[@data-label='МИ по Северо-Западному ФО']";
    public static final String MI_PO_SEBIRSCOMU_FO = "//li[@data-label='МИ по Сибирскому ФО']";
    public static final String MI_PO_CENTRALNOMU_FO = "//li[@data-label='МИ по Центральному ФО']";
    public static final String MI_PO_IUJNOMU_I_SEVERNOMU_KAVKAZU = "//li[contains(text(),'МИ по Южному и Северо-Кавказскому ФО')]";
    public static final String MI_PO_GORODU_MOSCOW = "//li[@data-label='МИ по городу Москва']";
    public static final String CALUGA_DEP = "//li[@data-label='Отделение Калуга']";
    public static final String SEVERO_ZAPADNOE_GU_BANK_OF_RUSSIA = "//li[@data-label='Северо-Западное ГУ Банка России']";
    public static final String SIBIRSKOE_GU_BANKA_RUSSIA = "//li[@data-label='Сибирское ГУ Банка России']";
    public static final String URALSCOE_MI = "//li[@data-label='Уральская МИ']";
    public static final String URALSCOE_GU_OF_BANK_RUSSIA = "//li[@data-label='Уральское ГУ Банка России']";
    public static final String UJNOE_GU_OF_BANK_RUSSIA = "//li[@data-label='Южное ГУ Банка России']";

    //========================USERS TEMPLATES PAGE=============================================
    public static final String USERS_TEMPLATES_PAGE = "//a[contains(text(),'Пользовательские шаблоны')]";

    //========================MY RIGHTS PAGE=============================================
    public static final String MY_RIGHTS_PAGE = "//a[contains(text(),'Мои права')]";

}

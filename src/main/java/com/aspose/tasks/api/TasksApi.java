package com.aspose.tasks.api;

import com.aspose.client.ApiException;
import com.aspose.client.ApiInvoker;
import com.aspose.client.ApiInvokerResponse;

import com.aspose.tasks.model.TaskLinkResponse;
import com.aspose.tasks.model.TaskLinksResponse;
import com.aspose.tasks.model.OutlineCodeResponse;
import com.aspose.tasks.model.DocumentProperty;
import com.aspose.tasks.model.TaskLink;
import com.aspose.tasks.model.CalendarResponse;
import com.aspose.tasks.model.CalendarExceptionsResponse;
import com.aspose.tasks.model.AssignmentItemsResponse;
import com.aspose.tasks.model.ResourceItemsResponse;
import com.aspose.tasks.model.DocumentPropertyResponse;
import com.aspose.tasks.model.ExtendedAttributeItemsResponse;
import com.aspose.tasks.model.CalendarException;
import com.aspose.tasks.model.ResourceResponse;
import com.aspose.tasks.model.AssignmentItemResponse;
import com.aspose.tasks.model.SaaSposeResponse;
import com.aspose.tasks.model.AssignmentResponse;
import com.aspose.tasks.model.ExtendedAttributeResponse;
import com.aspose.tasks.model.CalendarItemResponse;
import com.aspose.tasks.model.TaskItemsResponse;
import com.aspose.tasks.model.OutlineCodeItemsResponse;
import com.aspose.tasks.model.ResponseMessage;
import com.aspose.tasks.model.TaskItemResponse;
import com.aspose.tasks.model.AssignmentsResponse;
import com.aspose.tasks.model.Calendar;
import com.aspose.tasks.model.DocumentPropertiesResponse;
import com.aspose.tasks.model.ResourceItemResponse;
import com.aspose.tasks.model.TaskResponse;
import com.aspose.tasks.model.CalendarItemsResponse;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class TasksApi {
  String basePath = "http://api.aspose.com/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();
  ApiInvokerResponse response = null;

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteProjectAssignment
	* Deletes a project assignment with all references to it.
	* @param name	String	The name of the file.
	* @param assignmentUid	Integer	assignment Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteProjectAssignment (String name, Integer assignmentUid, String storage, String folder, String fileName) {
    Object postBody = null;
    // verify required params are set
    if(name == null || assignmentUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/assignments/{assignmentUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;fileName={fileName}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(assignmentUid!=null)
      queryParams.put("assignmentUid", String.valueOf(assignmentUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectAssignment
	* Read project assignment.
	* @param name	String	The name of the file.
	* @param assignmentUid	Integer	Assignment Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AssignmentResponse
	*/

  public AssignmentResponse GetProjectAssignment (String name, Integer assignmentUid, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || assignmentUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/assignments/{assignmentUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(assignmentUid!=null)
      queryParams.put("assignmentUid", String.valueOf(assignmentUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AssignmentResponse) ApiInvoker.deserialize(response, "", AssignmentResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectAssignments
	* Read project assignment items.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AssignmentItemsResponse
	*/

  public AssignmentItemsResponse GetProjectAssignments (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/assignments/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AssignmentItemsResponse) ApiInvoker.deserialize(response, "", AssignmentItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostProjectAssignment
	* Adds a new assignment to a project and returns assignment item in a response.
	* @param name	String	The name of the file.
	* @param taskUid	Integer	The unique id of the task to be assigned.
	* @param resourceUid	Integer	The unique id of the resource to be assigned.
	* @param units	Double	The units for the new assignment. Default value is 1.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AssignmentItemResponse
	*/

  public AssignmentItemResponse PostProjectAssignment (String name, Integer taskUid, Integer resourceUid, Double units, String fileName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || taskUid == null || resourceUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/assignments/?appSid={appSid}&amp;taskUid={taskUid}&amp;resourceUid={resourceUid}&amp;units={units}&amp;fileName={fileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(taskUid!=null)
      queryParams.put("taskUid", String.valueOf(taskUid));
    if(resourceUid!=null)
      queryParams.put("resourceUid", String.valueOf(resourceUid));
    if(units!=null)
      queryParams.put("units", String.valueOf(units));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (AssignmentItemResponse) ApiInvoker.deserialize(response, "", AssignmentItemResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteCalendarException
	* Deletes calendar exception from calendar exceptions collection.
	* @param name	String	The name of the file.
	* @param calendarUid	Integer	Calendar Uid
	* @param index	Integer	Calendar exception index
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteCalendarException (String name, Integer calendarUid, Integer index, String fileName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || calendarUid == null || index == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/{calendarUid}/calendarExceptions/{index}/?appSid={appSid}&amp;fileName={fileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(calendarUid!=null)
      queryParams.put("calendarUid", String.valueOf(calendarUid));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteProjectCalendar
	* Deletes a project calendar
	* @param name	String	The name of the file.
	* @param calendarUid	Integer	Calendar Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteProjectCalendar (String name, Integer calendarUid, String storage, String folder, String fileName) {
    Object postBody = null;
    // verify required params are set
    if(name == null || calendarUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/{calendarUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;fileName={fileName}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(calendarUid!=null)
      queryParams.put("calendarUid", String.valueOf(calendarUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetCalendarExceptions
	* Get list of calendar exceptions.
	* @param name	String	The name of the file.
	* @param calendarUid	Integer	Calendar Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return CalendarExceptionsResponse
	*/

  public CalendarExceptionsResponse GetCalendarExceptions (String name, Integer calendarUid, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || calendarUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/{calendarUid}/calendarExceptions/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(calendarUid!=null)
      queryParams.put("calendarUid", String.valueOf(calendarUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (CalendarExceptionsResponse) ApiInvoker.deserialize(response, "", CalendarExceptionsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectCalendar
	* Represents a project calendar.
	* @param name	String	The name of the file.
	* @param calendarUid	Integer	Calendar Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return CalendarResponse
	*/

  public CalendarResponse GetProjectCalendar (String name, Integer calendarUid, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || calendarUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/{calendarUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(calendarUid!=null)
      queryParams.put("calendarUid", String.valueOf(calendarUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (CalendarResponse) ApiInvoker.deserialize(response, "", CalendarResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectCalendars
	* Read project calendar items.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return CalendarItemsResponse
	*/

  public CalendarItemsResponse GetProjectCalendars (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (CalendarItemsResponse) ApiInvoker.deserialize(response, "", CalendarItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostCalendarExceptions
	* Adds a new calendar exception to a calendar.
	* @param name	String	The name of the file.
	* @param calendarUid	Integer	Calendar Uid
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	CalendarException	CalendarException DTO
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PostCalendarExceptions (String name, Integer calendarUid, String fileName, String storage, String folder, CalendarException body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || calendarUid == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/{calendarUid}/calendarExceptions/?appSid={appSid}&amp;fileName={fileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(calendarUid!=null)
      queryParams.put("calendarUid", String.valueOf(calendarUid));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostProjectCalendar
	* Adds a new calendar to project file.
	* @param name	String	The name of the file.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	Calendar	Calendar DTO
	* @return CalendarItemResponse
	*/

  public CalendarItemResponse PostProjectCalendar (String name, String fileName, String storage, String folder, Calendar body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/?appSid={appSid}&amp;fileName={fileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (CalendarItemResponse) ApiInvoker.deserialize(response, "", CalendarItemResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutCalendarException
	* Updates calendar exception.
	* @param name	String	The name of the file.
	* @param calendarUid	Integer	Calendar Uid
	* @param index	Integer	Calendar exception index
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param body	CalendarException	CalendarException DTO
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PutCalendarException (String name, Integer calendarUid, Integer index, String fileName, String storage, String folder, CalendarException body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || calendarUid == null || index == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/calendars/{calendarUid}/calendarExceptions/{index}/?appSid={appSid}&amp;fileName={fileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(calendarUid!=null)
      queryParams.put("calendarUid", String.valueOf(calendarUid));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetCriticalPath
	* Returns created report in PDF format.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return TaskItemsResponse
	*/

  public TaskItemsResponse GetCriticalPath (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/criticalPath/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TaskItemsResponse) ApiInvoker.deserialize(response, "", TaskItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetTaskDocument
	* Represents a project document.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetTaskDocument (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetTaskDocumentWithFormat
	* Represents a project document with format
	* @param name	String	The name of the file.
	* @param format	String	The original format of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetTaskDocumentWithFormat (String name, String format, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || format == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/?appSid={appSid}&amp;toFormat={toFormat}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentProperties
	* Read document properties.
	* @param name	String	The document name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DocumentPropertiesResponse
	*/

  public DocumentPropertiesResponse GetDocumentProperties (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/documentproperties/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertiesResponse) ApiInvoker.deserialize(response, "", DocumentPropertiesResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetDocumentProperty
	* Read document property by name.
	* @param name	String	The document name.
	* @param propertyName	String	The property name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse GetDocumentProperty (String name, String propertyName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || propertyName == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostDocumentProperty
	* Set/create document property.
	* @param name	String	The document name.
	* @param propertyName	String	The property name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param filename	String	Name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param body	DocumentProperty	with new property value.
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse PostDocumentProperty (String name, String propertyName, String storage, String folder, String filename, DocumentProperty body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || propertyName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;filename={filename}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutDocumentProperty
	* Set/create document property.
	* @param name	String	The document name.
	* @param propertyName	String	The property name.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param filename	String	Name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param body	DocumentProperty	with new property value.
	* @return DocumentPropertyResponse
	*/

  public DocumentPropertyResponse PutDocumentProperty (String name, String propertyName, String storage, String folder, String filename, DocumentProperty body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || propertyName == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/documentproperties/{propertyName}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;filename={filename}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(propertyName!=null)
      queryParams.put("propertyName", String.valueOf(propertyName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(filename!=null)
      queryParams.put("filename", String.valueOf(filename));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (DocumentPropertyResponse) ApiInvoker.deserialize(response, "", DocumentPropertyResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteExtendedAttributeByIndex
	* Delete a project extended attribute.
	* @param name	String	The name of the file.
	* @param index	Integer	Index of extended attribute
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteExtendedAttributeByIndex (String name, Integer index, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/extendedAttributes/{index}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetExtendedAttributeByIndex
	* Represents a project extended attribute definition.
	* @param name	String	The name of the file.
	* @param index	Integer	Index of extended attribute
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ExtendedAttributeResponse
	*/

  public ExtendedAttributeResponse GetExtendedAttributeByIndex (String name, Integer index, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/extendedAttributes/{index}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ExtendedAttributeResponse) ApiInvoker.deserialize(response, "", ExtendedAttributeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetExtendedAttributes
	* Represents a project document.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ExtendedAttributeItemsResponse
	*/

  public ExtendedAttributeItemsResponse GetExtendedAttributes (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/extendedAttributes/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ExtendedAttributeItemsResponse) ApiInvoker.deserialize(response, "", ExtendedAttributeItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteOutlineCodeByIndex
	* Deletes a project outline code
	* @param name	String	The name of the file.
	* @param index	Integer	Outline code index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteOutlineCodeByIndex (String name, Integer index, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/outlineCodes/{index}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetOutlineCodeByIndex
	* Get outline code by index.
	* @param name	String	The name of the file.
	* @param index	Integer	Outline code index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return OutlineCodeResponse
	*/

  public OutlineCodeResponse GetOutlineCodeByIndex (String name, Integer index, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/outlineCodes/{index}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (OutlineCodeResponse) ApiInvoker.deserialize(response, "", OutlineCodeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetOutlineCodes
	* Read outline codes.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return OutlineCodeItemsResponse
	*/

  public OutlineCodeItemsResponse GetOutlineCodes (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/outlineCodes/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (OutlineCodeItemsResponse) ApiInvoker.deserialize(response, "", OutlineCodeItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetReportPdf
	* Returns created report in PDF format.
	* @param name	String	The name of the file.
	* @param type	ReportType	A type of the project's graphical report.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResponseMessage
	*/

  public ResponseMessage GetReportPdf (String name, String type, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || type == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/report/?appSid={appSid}&amp;type={type}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(type!=null)
      queryParams.put("type", String.valueOf(type));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteProjectResource
	* Deletes a project resource with all references to it
	* @param name	String	The name of the file.
	* @param resourceUid	Integer	Resource Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteProjectResource (String name, Integer resourceUid, String storage, String folder, String fileName) {
    Object postBody = null;
    // verify required params are set
    if(name == null || resourceUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/resources/{resourceUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;fileName={fileName}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(resourceUid!=null)
      queryParams.put("resourceUid", String.valueOf(resourceUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectResource
	* Get project resource.
	* @param name	String	The name of the file.
	* @param resourceUid	Integer	Resource Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResourceResponse
	*/

  public ResourceResponse GetProjectResource (String name, Integer resourceUid, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || resourceUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/resources/{resourceUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(resourceUid!=null)
      queryParams.put("resourceUid", String.valueOf(resourceUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResourceResponse) ApiInvoker.deserialize(response, "", ResourceResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectResources
	* Read project resources.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResourceItemsResponse
	*/

  public ResourceItemsResponse GetProjectResources (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/resources/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResourceItemsResponse) ApiInvoker.deserialize(response, "", ResourceItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetResourceAssignments
	* Get resource assignments.
	* @param name	String	The name of the file.
	* @param resourceUid	Integer	Resource Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AssignmentsResponse
	*/

  public AssignmentsResponse GetResourceAssignments (String name, Integer resourceUid, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || resourceUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/resources/{resourceUid}/assignments/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(resourceUid!=null)
      queryParams.put("resourceUid", String.valueOf(resourceUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AssignmentsResponse) ApiInvoker.deserialize(response, "", AssignmentsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostProjectResource
	* Add a new resource to a project.
	* @param name	String	The name of the file.
	* @param resourceName	String	The name of the new resource. The default value is an empty string
	* @param beforeResourceId	Integer	The id of the resource to insert the new resource before. The default value is the id of the last resource in a project file.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return ResourceItemResponse
	*/

  public ResourceItemResponse PostProjectResource (String name, String resourceName, Integer beforeResourceId, String fileName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/resources/?appSid={appSid}&amp;resourceName={resourceName}&amp;beforeResourceId={beforeResourceId}&amp;fileName={fileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(resourceName!=null)
      queryParams.put("resourceName", String.valueOf(resourceName));
    if(beforeResourceId!=null)
      queryParams.put("beforeResourceId", String.valueOf(beforeResourceId));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (ResourceItemResponse) ApiInvoker.deserialize(response, "", ResourceItemResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteProjectTask
	* Deletes a project task with all references to it and rebuilds tasks tree.
	* @param name	String	The name of the file.
	* @param taskUid	Integer	Task Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteProjectTask (String name, Integer taskUid, String storage, String folder, String fileName) {
    Object postBody = null;
    // verify required params are set
    if(name == null || taskUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/tasks/{taskUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;fileName={fileName}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(taskUid!=null)
      queryParams.put("taskUid", String.valueOf(taskUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectTask
	* Read project task.
	* @param name	String	The name of the file.
	* @param taskUid	Integer	Task Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return TaskResponse
	*/

  public TaskResponse GetProjectTask (String name, Integer taskUid, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || taskUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/tasks/{taskUid}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(taskUid!=null)
      queryParams.put("taskUid", String.valueOf(taskUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TaskResponse) ApiInvoker.deserialize(response, "", TaskResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetProjectTasks
	* Read project task items.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return TaskItemsResponse
	*/

  public TaskItemsResponse GetProjectTasks (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/tasks/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TaskItemsResponse) ApiInvoker.deserialize(response, "", TaskItemsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetTaskAssignments
	* Get task assignments.
	* @param name	String	The name of the file.
	* @param taskUid	Integer	Task Uid
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return AssignmentsResponse
	*/

  public AssignmentsResponse GetTaskAssignments (String name, Integer taskUid, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null || taskUid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/tasks/{taskUid}/assignments/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(taskUid!=null)
      queryParams.put("taskUid", String.valueOf(taskUid));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (AssignmentsResponse) ApiInvoker.deserialize(response, "", AssignmentsResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostProjectTask
	* Add a new task to a project.
	* @param name	String	The name of the file.
	* @param taskName	String	The name of the new task. The default value is an empty string
	* @param beforeTaskId	Integer	The id of the task to insert the new task before. The default value is the id of the last task in a project file.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return TaskItemResponse
	*/

  public TaskItemResponse PostProjectTask (String name, String taskName, Integer beforeTaskId, String fileName, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/tasks/?appSid={appSid}&amp;taskName={taskName}&amp;beforeTaskId={beforeTaskId}&amp;fileName={fileName}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(taskName!=null)
      queryParams.put("taskName", String.valueOf(taskName));
    if(beforeTaskId!=null)
      queryParams.put("beforeTaskId", String.valueOf(beforeTaskId));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (TaskItemResponse) ApiInvoker.deserialize(response, "", TaskItemResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* DeleteTaskLink
	* Updates task link.
	* @param name	String	The name of the file.
	* @param index	Integer	Task link index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse DeleteTaskLink (String name, Integer index, String storage, String folder, String fileName) {
    Object postBody = null;
    // verify required params are set
    if(name == null || index == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/taskLinks/{index}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;fileName={fileName}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetTaskLinks
	* Read task links.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @return TaskLinksResponse
	*/

  public TaskLinksResponse GetTaskLinks (String name, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/taskLinks/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (TaskLinksResponse) ApiInvoker.deserialize(response, "", TaskLinksResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostTaskLink
	* Adds a new task link to a project.
	* @param name	String	The name of the file.
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param body	TaskLink	TaskLink dto
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PostTaskLink (String name, String storage, String folder, String fileName, TaskLink body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/taskLinks/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;fileName={fileName}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutTaskLink
	* Updates task link.
	* @param name	String	The name of the file.
	* @param index	Integer	Task link index
	* @param storage	String	The document storage.
	* @param folder	String	The document folder.
	* @param fileName	String	The name of the project document to save changes to. If this parameter is omitted then the changes will be saved to the source project document.
	* @param body	TaskLink	TaskLink dto
	* @return TaskLinkResponse
	*/

  public TaskLinkResponse PutTaskLink (String name, Integer index, String storage, String folder, String fileName, TaskLink body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || index == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/tasks/{name}/taskLinks/{index}/?appSid={appSid}&amp;storage={storage}&amp;folder={folder}&amp;fileName={fileName}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(index!=null)
      queryParams.put("index", String.valueOf(index));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    if(fileName!=null)
      queryParams.put("fileName", String.valueOf(fileName));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (TaskLinkResponse) ApiInvoker.deserialize(response, "", TaskLinkResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  }


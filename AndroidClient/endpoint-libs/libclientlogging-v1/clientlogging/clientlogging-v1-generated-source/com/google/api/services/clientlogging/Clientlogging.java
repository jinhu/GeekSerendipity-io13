/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-05-14 03:07:32 UTC)
 * on 2013-05-16 at 23:05:26 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.clientlogging;

/**
 * Service definition for Clientlogging (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ClientloggingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Clientlogging extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 14,
        "You are currently running with version %s of google-api-client. " +
        "You need version 1.14 of google-api-client to run version " +
        "1.14.2-beta of the  library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://geekfinder2.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "clientlogging/v1/logs/log/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Clientlogging(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Clientlogging(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Logs collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Clientlogging clientlogging = new Clientlogging(...);}
   *   {@code Clientlogging.Logs.List request = clientlogging.logs().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Logs logs() {
    return new Logs();
  }

  /**
   * The "logs" collection of methods.
   */
  public class Logs {

    /**
     * Create a request for the method "logs.log".
     *
     * This request holds the parameters needed by the the clientlogging server.  After setting any
     * optional parameters, call the {@link Log#execute()} method to invoke the remote operation.
     *
     * @param message
     * @return the request
     */
    public Log log(java.lang.String message) throws java.io.IOException {
      Log result = new Log(message);
      initialize(result);
      return result;
    }

    public class Log extends ClientloggingRequest<Void> {

      private static final String REST_PATH = "{message}";

      /**
       * Create a request for the method "logs.log".
       *
       * This request holds the parameters needed by the the clientlogging server.  After setting any
       * optional parameters, call the {@link Log#execute()} method to invoke the remote operation. <p>
       * {@link Log#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param message
       * @since 1.13
       */
      protected Log(java.lang.String message) {
        super(Clientlogging.this, "POST", REST_PATH, null, Void.class);
        this.message = com.google.api.client.util.Preconditions.checkNotNull(message, "Required parameter message must be specified.");
      }

      @Override
      public Log setAlt(java.lang.String alt) {
        return (Log) super.setAlt(alt);
      }

      @Override
      public Log setFields(java.lang.String fields) {
        return (Log) super.setFields(fields);
      }

      @Override
      public Log setKey(java.lang.String key) {
        return (Log) super.setKey(key);
      }

      @Override
      public Log setOauthToken(java.lang.String oauthToken) {
        return (Log) super.setOauthToken(oauthToken);
      }

      @Override
      public Log setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Log) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Log setQuotaUser(java.lang.String quotaUser) {
        return (Log) super.setQuotaUser(quotaUser);
      }

      @Override
      public Log setUserIp(java.lang.String userIp) {
        return (Log) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String message;

      /**

       */
      public java.lang.String getMessage() {
        return message;
      }

      public Log setMessage(java.lang.String message) {
        this.message = message;
        return this;
      }

      @Override
      public Log set(String parameterName, Object value) {
        return (Log) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Clientlogging}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Clientlogging}. */
    @Override
    public Clientlogging build() {
      return new Clientlogging(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ClientloggingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setClientloggingRequestInitializer(
        ClientloggingRequestInitializer clientloggingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(clientloggingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

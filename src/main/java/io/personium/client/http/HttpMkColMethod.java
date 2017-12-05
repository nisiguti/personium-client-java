/**
 * Personium
 * Copyright 2014 - 2017 FUJITSU LIMITED
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.personium.client.http;

import java.net.URI;

import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

///**
// * MKCOLメソッド定義.
// */
/**
 * It is used to created a new object of HttpMkColMethod. This class is the MKCOL method definition class.
 */
public class HttpMkColMethod extends HttpEntityEnclosingRequestBase {
    // /** メソッド名定義. */
    /** Method Name. */
    private static final String METHOD_NAME = "MKCOL";

    // /**
    // * コンストラクタ.
    // */
    /**
     * This is the default constructor calling its parent constructor.
     */
    public HttpMkColMethod() {
        super();
    }

    // /**
    // * コンストラクタ.
    // * @param uri 対象URLをセットしたURLオブジェクト
    // */
    /**
     * This is the parameterized constructor calling its parent constructor and setting URI.
     * @param uri URL object that set the target URL
     */
    public HttpMkColMethod(final URI uri) {
        super();
        setURI(uri);
    }

    // /**
    // * コンストラクタ.
    // * @param uri 対象URL文字列
    // */
    /**
     * This is the parameterized constructor calling its parent constructor and setting URI after formatting it.
     * @param uri Target URL string
     */
    public HttpMkColMethod(final String uri) {
        super();
        setURI(URI.create(uri));
    }

    /**
     * This method returns the method name.
     * @return Method name value
     */
    @Override
    public String getMethod() {
        return METHOD_NAME;
    }
}

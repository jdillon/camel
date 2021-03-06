/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.io.File;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * To insert or query from Apache Lucene databases.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LuceneEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Lucene component.
     */
    public interface LuceneEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLuceneEndpointBuilder advanced() {
            return (AdvancedLuceneEndpointBuilder) this;
        }
        /**
         * The URL to the lucene server.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * Operation to do such as insert or query.
         * The option is a
         * <code>org.apache.camel.component.lucene.LuceneOperation</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder operation(LuceneOperation operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Operation to do such as insert or query.
         * The option will be converted to a
         * <code>org.apache.camel.component.lucene.LuceneOperation</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box.
         * The option is a <code>org.apache.lucene.analysis.Analyzer</code>
         * type.
         * @group producer
         */
        default LuceneEndpointBuilder analyzer(Object analyzer) {
            setProperty("analyzer", analyzer);
            return this;
        }
        /**
         * An Analyzer builds TokenStreams, which analyze text. It thus
         * represents a policy for extracting index terms from text. The value
         * for analyzer can be any class that extends the abstract class
         * org.apache.lucene.analysis.Analyzer. Lucene also offers a rich set of
         * analyzers out of the box.
         * The option will be converted to a
         * <code>org.apache.lucene.analysis.Analyzer</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder analyzer(String analyzer) {
            setProperty("analyzer", analyzer);
            return this;
        }
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer.
         * The option is a <code>java.io.File</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder indexDir(File indexDir) {
            setProperty("indexDir", indexDir);
            return this;
        }
        /**
         * A file system directory in which index files are created upon
         * analysis of the document by the specified analyzer.
         * The option will be converted to a <code>java.io.File</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder indexDir(String indexDir) {
            setProperty("indexDir", indexDir);
            return this;
        }
        /**
         * An integer value that limits the result set of the search operation.
         * The option is a <code>int</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder maxHits(int maxHits) {
            setProperty("maxHits", maxHits);
            return this;
        }
        /**
         * An integer value that limits the result set of the search operation.
         * The option will be converted to a <code>int</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder maxHits(String maxHits) {
            setProperty("maxHits", maxHits);
            return this;
        }
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         * The option is a <code>java.io.File</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder srcDir(File srcDir) {
            setProperty("srcDir", srcDir);
            return this;
        }
        /**
         * An optional directory containing files to be used to be analyzed and
         * added to the index at producer startup.
         * The option will be converted to a <code>java.io.File</code> type.
         * @group producer
         */
        default LuceneEndpointBuilder srcDir(String srcDir) {
            setProperty("srcDir", srcDir);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Lucene component.
     */
    public interface AdvancedLuceneEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LuceneEndpointBuilder basic() {
            return (LuceneEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLuceneEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLuceneEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLuceneEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedLuceneEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.lucene.LuceneOperation</code> enum.
     */
    enum LuceneOperation {
        insert,
        query;
    }
    /**
     * To insert or query from Apache Lucene databases.
     * Maven coordinates: org.apache.camel:camel-lucene
     */
    default LuceneEndpointBuilder lucene(String path) {
        class LuceneEndpointBuilderImpl extends AbstractEndpointBuilder implements LuceneEndpointBuilder, AdvancedLuceneEndpointBuilder {
            public LuceneEndpointBuilderImpl(String path) {
                super("lucene", path);
            }
        }
        return new LuceneEndpointBuilderImpl(path);
    }
}
/*
    <notice>

    Copyright (c)2016 IBM Corporation

     Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
    The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

    </notice>
 */
package draplugin.dra;

import hudson.model.AbstractBuild;
import hudson.model.Action;
import hudson.model.Run;

/**
 * DRA action for builds, show the decision and report link in the build status page
 *
 * @author Xunrong Li
 */
public class GatePublisherAction implements Action {

    private final String text;
    private final String decision;
    private final String policyName;
//    private final String buildUrl;
    private final Run<?, ?> build;

    public GatePublisherAction(String text, String decision, String policyName, Run<?, ?> build) {
        this.text = text;
        this.decision = decision;
        this.policyName = policyName;
        this.build = build;
    }

    public String getText() {
        return text;
    }

    public String getDecision() {
        return decision;
    }

    public String getPolicyName() {
        return policyName;
    }

//    public String getBuildUrl() {
//        return buildUrl;
//    }


    public Run<?, ?> getBuild() {
        return build;
    }

    @Override
    public String getIconFileName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getUrlName() {
        return null;
    }
}

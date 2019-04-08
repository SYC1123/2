package com.example;

import java.util.List;

public class NewsRobot {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"Headline":[{"href":"http://bbs.hupu.com/16156932.html","title":"9:30直播：马刺迎战雷霆"},{"href":"http://bbs.hupu.com/16156977.html","title":"7:00直播：老鹰挑战骑士"}],"Information_list":[{"href":"http://bbs.hupu.com/16153046.html","title":"哈登为什么要去留一脸大胡子？"},{"href":"http://voice.hupu.com/nba/2027169.html","title":"里弗斯近照：脸部的感觉好点了"}],"ret_code":0}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * Headline : [{"href":"http://bbs.hupu.com/16156932.html","title":"9:30直播：马刺迎战雷霆"},{"href":"http://bbs.hupu.com/16156977.html","title":"7:00直播：老鹰挑战骑士"}]
         * Information_list : [{"href":"http://bbs.hupu.com/16153046.html","title":"哈登为什么要去留一脸大胡子？"},{"href":"http://voice.hupu.com/nba/2027169.html","title":"里弗斯近照：脸部的感觉好点了"}]
         * ret_code : 0
         */

        private int ret_code;
        private List<HeadlineBean> Headline;
        private List<InformationListBean> Information_list;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public List<HeadlineBean> getHeadline() {
            return Headline;
        }

        public void setHeadline(List<HeadlineBean> Headline) {
            this.Headline = Headline;
        }

        public List<InformationListBean> getInformation_list() {
            return Information_list;
        }

        public void setInformation_list(List<InformationListBean> Information_list) {
            this.Information_list = Information_list;
        }

        public static class HeadlineBean {
            /**
             * href : http://bbs.hupu.com/16156932.html
             * title : 9:30直播：马刺迎战雷霆
             */

            private String href;
            private String title;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class InformationListBean {
            /**
             * href : http://bbs.hupu.com/16153046.html
             * title : 哈登为什么要去留一脸大胡子？
             */

            private String href;
            private String title;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}



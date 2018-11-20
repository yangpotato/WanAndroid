package com.potato.wanandroid.data.entity.main;

import java.util.List;

public class ArticleEntity {

    /**
     * curPage : 1
     * datas : [{"apkLink":"","author":"JohnnyShieh","chapterId":424,"chapterName":"协程","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":true,"id":7527,"link":"https://www.jianshu.com/p/2979732fb6fb","niceDate":"22小时前","origin":"","projectLink":"","publishTime":1542614335000,"superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin Coroutines(协程) 完全解析（一），协程简介","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"谷歌开发者","chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7528,"link":"https://mp.weixin.qq.com/s/yrD8zUcnUs3LmNNhtWn4fw","niceDate":"1天前","origin":"","projectLink":"","publishTime":1542556800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"App 生存与壮大的五条原则","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7531,"link":"https://mp.weixin.qq.com/s/XjyH7nYqccNSZOKrvdAyLw","niceDate":"1天前","origin":"","projectLink":"","publishTime":1542556800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Ubuntu搭建Jenkins+Android自动化打包","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7533,"link":"https://mp.weixin.qq.com/s/rI_whEgWt88foGYwiBHG9Q","niceDate":"1天前","origin":"","projectLink":"","publishTime":1542556800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Android开发之图像处理那点事&mdash;&mdash;滤镜","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xlh__","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7526,"link":"https://www.jianshu.com/p/e94a444054b4","niceDate":"1天前","origin":"","projectLink":"","publishTime":1542546987000,"superChapterId":94,"superChapterName":"自定义控件","tags":[],"title":"自定义RecycleView下拉刷新","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"honglei92","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7525,"link":"https://www.jianshu.com/p/76a8a5e88460","niceDate":"1天前","origin":"","projectLink":"","publishTime":1542546693000,"superChapterId":94,"superChapterName":"自定义控件","tags":[],"title":"TabLayout源码解析和仿简书首页TabLayout效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"simplehych ","chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7524,"link":"https://www.jianshu.com/p/1317aed6cd8c","niceDate":"1天前","origin":"","projectLink":"","publishTime":1542546297000,"superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"Flutter与Android混合开发及Platform Channel的使用","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"互联网侦察","chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7535,"link":"https://mp.weixin.qq.com/s/uPoruWUD-v_1YQf2KPO45w","niceDate":"2天前","origin":"","projectLink":"","publishTime":1542470400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"【面试现场】如何编程解决朋友圈个数问题？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7529,"link":"https://mp.weixin.qq.com/s/8yaGzZ2VFSDO9A5rwUrM-g","niceDate":"2018-11-16","origin":"","projectLink":"","publishTime":1542297600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"分享一下三年来公众号的小经验","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7530,"link":"https://mp.weixin.qq.com/s/rq3gTxASebJxW_6WcSa-GQ","niceDate":"2018-11-16","origin":"","projectLink":"","publishTime":1542297600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"插件化之代码调用与加载资源","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7532,"link":"https://mp.weixin.qq.com/s/Ng0vkIluCuL_VjNDyVy1Zg","niceDate":"2018-11-16","origin":"","projectLink":"","publishTime":1542297600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"开机向导到联网状态，一直失败问题分析","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"互联网侦察","chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7534,"link":"https://mp.weixin.qq.com/s/erWD9cVBl0biXDyzMLD_vQ","niceDate":"2018-11-16","origin":"","projectLink":"","publishTime":1542297600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"循序渐进带你学习时间复杂度和空间复杂度。","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7519,"link":"https://mp.weixin.qq.com/s/67nMAJQt6FN1VsE_nayVoQ","niceDate":"2018-11-15","origin":"","projectLink":"","publishTime":1542211200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"弄懂Android 源码中那些巧妙位运算","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"张风捷特烈","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7518,"link":"https://www.jianshu.com/p/dd8e325b2ae3","niceDate":"2018-11-14","origin":"","projectLink":"","publishTime":1542201035000,"superChapterId":94,"superChapterName":"自定义控件","tags":[],"title":"Android原生绘图之炫酷倒计时","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"张风捷特烈","chapterId":228,"chapterName":"辅助 or 工具类","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7517,"link":"https://www.jianshu.com/p/0e656257f25d","niceDate":"2018-11-14","origin":"","projectLink":"","publishTime":1542201000000,"superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"分享一下我的三个代码自动生成工具类--助你解放双手","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7514,"link":"https://mp.weixin.qq.com/s/L7wQuua9o5F3YQn3mI-Dfg","niceDate":"2018-11-14","origin":"","projectLink":"","publishTime":1542124800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"推荐2个走心项目","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7515,"link":"https://mp.weixin.qq.com/s/eZX1el8qFAHACefDmqiTTQ","niceDate":"2018-11-14","origin":"","projectLink":"","publishTime":1542124800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"Toast替代者，Snackbar的源码是这样设计的","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7516,"link":"https://mp.weixin.qq.com/s/WhRNLIlV78BLuCP0diWVcw","niceDate":"2018-11-14","origin":"","projectLink":"","publishTime":1542124800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"如何统计Android App启动时间","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"黄铭1991","chapterId":99,"chapterName":"具体案例","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7511,"link":"https://www.jianshu.com/p/ef624454535c","niceDate":"2018-11-13","origin":"","projectLink":"","publishTime":1542122742000,"superChapterId":94,"superChapterName":"自定义控件","tags":[],"title":"手把手教你用RecyclerView实现猫眼电影选择效果","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"xiaobailong24","chapterId":334,"chapterName":"Architecture Components","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":7510,"link":"https://www.jianshu.com/p/c1ee77f8237f","niceDate":"2018-11-13","origin":"","projectLink":"","publishTime":1542122709000,"superChapterId":179,"superChapterName":"5.+高新技术","tags":[],"title":"【译】使用 Android Architecture Components 的五个常见误区","type":0,"userId":-1,"visible":1,"zan":0}]
     * offset : 0
     * over : false
     * pageCount : 285
     * size : 20
     * total : 5692
     */

    private int curPage;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;
    private List<DatasBean> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {

        /**
         * apkLink :
         * author : 郭霖
         * chapterId : 409
         * chapterName : 郭霖
         * collect : false
         * courseId : 13
         * desc :
         * envelopePic :
         * fresh : false
         * id : 7515
         * link : https://mp.weixin.qq.com/s/eZX1el8qFAHACefDmqiTTQ
         * niceDate : 2018-11-14
         * origin :
         * projectLink :
         * publishTime : 1542124800000
         * superChapterId : 408
         * superChapterName : 公众号
         * tags : [{"name":"公众号","url":"/wxarticle/list/409/1"}]
         * title : Toast替代者，Snackbar的源码是这样设计的
         * type : 0
         * userId : -1
         * visible : 1
         * zan : 0
         */

        private String apkLink;
        private String author;
        private int chapterId;
        private String chapterName;
        private boolean collect;
        private int courseId;
        private String desc;
        private String envelopePic;
        private boolean fresh;
        private int id;
        private String link;
        private String niceDate;
        private String origin;
        private String projectLink;
        private long publishTime;
        private int superChapterId;
        private String superChapterName;
        private String title;
        private int type;
        private int userId;
        private int visible;
        private int zan;
        private List<TagsBean> tags;

        public String getApkLink() {
            return apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public boolean isCollect() {
            return collect;
        }

        public void setCollect(boolean collect) {
            this.collect = collect;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getEnvelopePic() {
            return envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public boolean isFresh() {
            return fresh;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getProjectLink() {
            return projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public int getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class TagsBean {
            /**
             * name : 公众号
             * url : /wxarticle/list/409/1
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}

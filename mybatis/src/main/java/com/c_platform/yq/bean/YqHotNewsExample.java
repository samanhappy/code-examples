package com.c_platform.yq.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.javaw.mybatis.generator.Page;

public class YqHotNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public YqHotNewsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(Long value) {
            addCriterion("SOURCE_ID =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(Long value) {
            addCriterion("SOURCE_ID <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(Long value) {
            addCriterion("SOURCE_ID >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SOURCE_ID >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(Long value) {
            addCriterion("SOURCE_ID <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(Long value) {
            addCriterion("SOURCE_ID <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<Long> values) {
            addCriterion("SOURCE_ID in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<Long> values) {
            addCriterion("SOURCE_ID not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(Long value1, Long value2) {
            addCriterion("SOURCE_ID between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(Long value1, Long value2) {
            addCriterion("SOURCE_ID not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("CHANNEL_ID like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("OPEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("OPEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(Long value) {
            addCriterion("OPEN_TYPE =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(Long value) {
            addCriterion("OPEN_TYPE <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(Long value) {
            addCriterion("OPEN_TYPE >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("OPEN_TYPE >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(Long value) {
            addCriterion("OPEN_TYPE <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(Long value) {
            addCriterion("OPEN_TYPE <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<Long> values) {
            addCriterion("OPEN_TYPE in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<Long> values) {
            addCriterion("OPEN_TYPE not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(Long value1, Long value2) {
            addCriterion("OPEN_TYPE between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(Long value1, Long value2) {
            addCriterion("OPEN_TYPE not between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentUrlIsNull() {
            addCriterion("CONTENT_URL is null");
            return (Criteria) this;
        }

        public Criteria andContentUrlIsNotNull() {
            addCriterion("CONTENT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andContentUrlEqualTo(String value) {
            addCriterion("CONTENT_URL =", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotEqualTo(String value) {
            addCriterion("CONTENT_URL <>", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlGreaterThan(String value) {
            addCriterion("CONTENT_URL >", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_URL >=", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLessThan(String value) {
            addCriterion("CONTENT_URL <", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_URL <=", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLike(String value) {
            addCriterion("CONTENT_URL like", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotLike(String value) {
            addCriterion("CONTENT_URL not like", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlIn(List<String> values) {
            addCriterion("CONTENT_URL in", values, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotIn(List<String> values) {
            addCriterion("CONTENT_URL not in", values, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlBetween(String value1, String value2) {
            addCriterion("CONTENT_URL between", value1, value2, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotBetween(String value1, String value2) {
            addCriterion("CONTENT_URL not between", value1, value2, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNull() {
            addCriterion("NEWS_URL is null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIsNotNull() {
            addCriterion("NEWS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUrlEqualTo(String value) {
            addCriterion("NEWS_URL =", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotEqualTo(String value) {
            addCriterion("NEWS_URL <>", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThan(String value) {
            addCriterion("NEWS_URL >", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NEWS_URL >=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThan(String value) {
            addCriterion("NEWS_URL <", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLessThanOrEqualTo(String value) {
            addCriterion("NEWS_URL <=", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlLike(String value) {
            addCriterion("NEWS_URL like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotLike(String value) {
            addCriterion("NEWS_URL not like", value, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlIn(List<String> values) {
            addCriterion("NEWS_URL in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotIn(List<String> values) {
            addCriterion("NEWS_URL not in", values, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlBetween(String value1, String value2) {
            addCriterion("NEWS_URL between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andNewsUrlNotBetween(String value1, String value2) {
            addCriterion("NEWS_URL not between", value1, value2, "newsUrl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNull() {
            addCriterion("NEWS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIsNotNull() {
            addCriterion("NEWS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeEqualTo(Long value) {
            addCriterion("NEWS_TYPE =", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotEqualTo(Long value) {
            addCriterion("NEWS_TYPE <>", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThan(Long value) {
            addCriterion("NEWS_TYPE >", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWS_TYPE >=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThan(Long value) {
            addCriterion("NEWS_TYPE <", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeLessThanOrEqualTo(Long value) {
            addCriterion("NEWS_TYPE <=", value, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIn(List<Long> values) {
            addCriterion("NEWS_TYPE in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotIn(List<Long> values) {
            addCriterion("NEWS_TYPE not in", values, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeBetween(Long value1, Long value2) {
            addCriterion("NEWS_TYPE between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNotBetween(Long value1, Long value2) {
            addCriterion("NEWS_TYPE not between", value1, value2, "newsType");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("COMMENT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("COMMENT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Long value) {
            addCriterion("COMMENT_COUNT =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Long value) {
            addCriterion("COMMENT_COUNT <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Long value) {
            addCriterion("COMMENT_COUNT >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENT_COUNT >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Long value) {
            addCriterion("COMMENT_COUNT <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Long value) {
            addCriterion("COMMENT_COUNT <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Long> values) {
            addCriterion("COMMENT_COUNT in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Long> values) {
            addCriterion("COMMENT_COUNT not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Long value1, Long value2) {
            addCriterion("COMMENT_COUNT between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Long value1, Long value2) {
            addCriterion("COMMENT_COUNT not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andContentSourceIsNull() {
            addCriterion("CONTENT_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andContentSourceIsNotNull() {
            addCriterion("CONTENT_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andContentSourceEqualTo(String value) {
            addCriterion("CONTENT_SOURCE =", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceNotEqualTo(String value) {
            addCriterion("CONTENT_SOURCE <>", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceGreaterThan(String value) {
            addCriterion("CONTENT_SOURCE >", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_SOURCE >=", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceLessThan(String value) {
            addCriterion("CONTENT_SOURCE <", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_SOURCE <=", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceLike(String value) {
            addCriterion("CONTENT_SOURCE like", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceNotLike(String value) {
            addCriterion("CONTENT_SOURCE not like", value, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceIn(List<String> values) {
            addCriterion("CONTENT_SOURCE in", values, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceNotIn(List<String> values) {
            addCriterion("CONTENT_SOURCE not in", values, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceBetween(String value1, String value2) {
            addCriterion("CONTENT_SOURCE between", value1, value2, "contentSource");
            return (Criteria) this;
        }

        public Criteria andContentSourceNotBetween(String value1, String value2) {
            addCriterion("CONTENT_SOURCE not between", value1, value2, "contentSource");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("IMAGE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("IMAGE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("IMAGE_PATH =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("IMAGE_PATH <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("IMAGE_PATH >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATH >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("IMAGE_PATH <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_PATH <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("IMAGE_PATH like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("IMAGE_PATH not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("IMAGE_PATH in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("IMAGE_PATH not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("IMAGE_PATH between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("IMAGE_PATH not between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNull() {
            addCriterion("BANNER_URL is null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIsNotNull() {
            addCriterion("BANNER_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBannerUrlEqualTo(String value) {
            addCriterion("BANNER_URL =", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotEqualTo(String value) {
            addCriterion("BANNER_URL <>", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThan(String value) {
            addCriterion("BANNER_URL >", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BANNER_URL >=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThan(String value) {
            addCriterion("BANNER_URL <", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLessThanOrEqualTo(String value) {
            addCriterion("BANNER_URL <=", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlLike(String value) {
            addCriterion("BANNER_URL like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotLike(String value) {
            addCriterion("BANNER_URL not like", value, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlIn(List<String> values) {
            addCriterion("BANNER_URL in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotIn(List<String> values) {
            addCriterion("BANNER_URL not in", values, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlBetween(String value1, String value2) {
            addCriterion("BANNER_URL between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andBannerUrlNotBetween(String value1, String value2) {
            addCriterion("BANNER_URL not between", value1, value2, "bannerUrl");
            return (Criteria) this;
        }

        public Criteria andNegativeCountIsNull() {
            addCriterion("NEGATIVE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andNegativeCountIsNotNull() {
            addCriterion("NEGATIVE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNegativeCountEqualTo(Long value) {
            addCriterion("NEGATIVE_COUNT =", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountNotEqualTo(Long value) {
            addCriterion("NEGATIVE_COUNT <>", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountGreaterThan(Long value) {
            addCriterion("NEGATIVE_COUNT >", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountGreaterThanOrEqualTo(Long value) {
            addCriterion("NEGATIVE_COUNT >=", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountLessThan(Long value) {
            addCriterion("NEGATIVE_COUNT <", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountLessThanOrEqualTo(Long value) {
            addCriterion("NEGATIVE_COUNT <=", value, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountIn(List<Long> values) {
            addCriterion("NEGATIVE_COUNT in", values, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountNotIn(List<Long> values) {
            addCriterion("NEGATIVE_COUNT not in", values, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountBetween(Long value1, Long value2) {
            addCriterion("NEGATIVE_COUNT between", value1, value2, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeCountNotBetween(Long value1, Long value2) {
            addCriterion("NEGATIVE_COUNT not between", value1, value2, "negativeCount");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyIsNull() {
            addCriterion("NEGATIVE_ENERGY is null");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyIsNotNull() {
            addCriterion("NEGATIVE_ENERGY is not null");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyEqualTo(Long value) {
            addCriterion("NEGATIVE_ENERGY =", value, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyNotEqualTo(Long value) {
            addCriterion("NEGATIVE_ENERGY <>", value, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyGreaterThan(Long value) {
            addCriterion("NEGATIVE_ENERGY >", value, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyGreaterThanOrEqualTo(Long value) {
            addCriterion("NEGATIVE_ENERGY >=", value, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyLessThan(Long value) {
            addCriterion("NEGATIVE_ENERGY <", value, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyLessThanOrEqualTo(Long value) {
            addCriterion("NEGATIVE_ENERGY <=", value, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyIn(List<Long> values) {
            addCriterion("NEGATIVE_ENERGY in", values, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyNotIn(List<Long> values) {
            addCriterion("NEGATIVE_ENERGY not in", values, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyBetween(Long value1, Long value2) {
            addCriterion("NEGATIVE_ENERGY between", value1, value2, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andNegativeEnergyNotBetween(Long value1, Long value2) {
            addCriterion("NEGATIVE_ENERGY not between", value1, value2, "negativeEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveCountIsNull() {
            addCriterion("POSITIVE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andPositiveCountIsNotNull() {
            addCriterion("POSITIVE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPositiveCountEqualTo(Long value) {
            addCriterion("POSITIVE_COUNT =", value, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountNotEqualTo(Long value) {
            addCriterion("POSITIVE_COUNT <>", value, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountGreaterThan(Long value) {
            addCriterion("POSITIVE_COUNT >", value, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountGreaterThanOrEqualTo(Long value) {
            addCriterion("POSITIVE_COUNT >=", value, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountLessThan(Long value) {
            addCriterion("POSITIVE_COUNT <", value, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountLessThanOrEqualTo(Long value) {
            addCriterion("POSITIVE_COUNT <=", value, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountIn(List<Long> values) {
            addCriterion("POSITIVE_COUNT in", values, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountNotIn(List<Long> values) {
            addCriterion("POSITIVE_COUNT not in", values, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountBetween(Long value1, Long value2) {
            addCriterion("POSITIVE_COUNT between", value1, value2, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveCountNotBetween(Long value1, Long value2) {
            addCriterion("POSITIVE_COUNT not between", value1, value2, "positiveCount");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyIsNull() {
            addCriterion("POSITIVE_ENERGY is null");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyIsNotNull() {
            addCriterion("POSITIVE_ENERGY is not null");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyEqualTo(Long value) {
            addCriterion("POSITIVE_ENERGY =", value, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyNotEqualTo(Long value) {
            addCriterion("POSITIVE_ENERGY <>", value, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyGreaterThan(Long value) {
            addCriterion("POSITIVE_ENERGY >", value, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyGreaterThanOrEqualTo(Long value) {
            addCriterion("POSITIVE_ENERGY >=", value, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyLessThan(Long value) {
            addCriterion("POSITIVE_ENERGY <", value, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyLessThanOrEqualTo(Long value) {
            addCriterion("POSITIVE_ENERGY <=", value, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyIn(List<Long> values) {
            addCriterion("POSITIVE_ENERGY in", values, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyNotIn(List<Long> values) {
            addCriterion("POSITIVE_ENERGY not in", values, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyBetween(Long value1, Long value2) {
            addCriterion("POSITIVE_ENERGY between", value1, value2, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andPositiveEnergyNotBetween(Long value1, Long value2) {
            addCriterion("POSITIVE_ENERGY not between", value1, value2, "positiveEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyIsNull() {
            addCriterion("TOTAL_ENERGY is null");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyIsNotNull() {
            addCriterion("TOTAL_ENERGY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyEqualTo(Long value) {
            addCriterion("TOTAL_ENERGY =", value, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyNotEqualTo(Long value) {
            addCriterion("TOTAL_ENERGY <>", value, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyGreaterThan(Long value) {
            addCriterion("TOTAL_ENERGY >", value, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ENERGY >=", value, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyLessThan(Long value) {
            addCriterion("TOTAL_ENERGY <", value, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_ENERGY <=", value, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyIn(List<Long> values) {
            addCriterion("TOTAL_ENERGY in", values, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyNotIn(List<Long> values) {
            addCriterion("TOTAL_ENERGY not in", values, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ENERGY between", value1, value2, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andTotalEnergyNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_ENERGY not between", value1, value2, "totalEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyIsNull() {
            addCriterion("IS_ENERGY is null");
            return (Criteria) this;
        }

        public Criteria andIsEnergyIsNotNull() {
            addCriterion("IS_ENERGY is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnergyEqualTo(Integer value) {
            addCriterion("IS_ENERGY =", value, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyNotEqualTo(Integer value) {
            addCriterion("IS_ENERGY <>", value, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyGreaterThan(Integer value) {
            addCriterion("IS_ENERGY >", value, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ENERGY >=", value, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyLessThan(Integer value) {
            addCriterion("IS_ENERGY <", value, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ENERGY <=", value, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyIn(List<Integer> values) {
            addCriterion("IS_ENERGY in", values, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyNotIn(List<Integer> values) {
            addCriterion("IS_ENERGY not in", values, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyBetween(Integer value1, Integer value2) {
            addCriterion("IS_ENERGY between", value1, value2, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andIsEnergyNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ENERGY not between", value1, value2, "isEnergy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
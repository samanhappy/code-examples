package com.c_platform.yq.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.javaw.mybatis.generator.Page;

public class YqInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public YqInfoExample() {
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

        public Criteria andYqIdIsNull() {
            addCriterion("YQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andYqIdIsNotNull() {
            addCriterion("YQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andYqIdEqualTo(String value) {
            addCriterion("YQ_ID =", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdNotEqualTo(String value) {
            addCriterion("YQ_ID <>", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdGreaterThan(String value) {
            addCriterion("YQ_ID >", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdGreaterThanOrEqualTo(String value) {
            addCriterion("YQ_ID >=", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdLessThan(String value) {
            addCriterion("YQ_ID <", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdLessThanOrEqualTo(String value) {
            addCriterion("YQ_ID <=", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdLike(String value) {
            addCriterion("YQ_ID like", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdNotLike(String value) {
            addCriterion("YQ_ID not like", value, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdIn(List<String> values) {
            addCriterion("YQ_ID in", values, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdNotIn(List<String> values) {
            addCriterion("YQ_ID not in", values, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdBetween(String value1, String value2) {
            addCriterion("YQ_ID between", value1, value2, "yqId");
            return (Criteria) this;
        }

        public Criteria andYqIdNotBetween(String value1, String value2) {
            addCriterion("YQ_ID not between", value1, value2, "yqId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdIsNull() {
            addCriterion("PROPAGATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPropagationIdIsNotNull() {
            addCriterion("PROPAGATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPropagationIdEqualTo(Long value) {
            addCriterion("PROPAGATION_ID =", value, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdNotEqualTo(Long value) {
            addCriterion("PROPAGATION_ID <>", value, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdGreaterThan(Long value) {
            addCriterion("PROPAGATION_ID >", value, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROPAGATION_ID >=", value, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdLessThan(Long value) {
            addCriterion("PROPAGATION_ID <", value, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdLessThanOrEqualTo(Long value) {
            addCriterion("PROPAGATION_ID <=", value, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdIn(List<Long> values) {
            addCriterion("PROPAGATION_ID in", values, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdNotIn(List<Long> values) {
            addCriterion("PROPAGATION_ID not in", values, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdBetween(Long value1, Long value2) {
            addCriterion("PROPAGATION_ID between", value1, value2, "propagationId");
            return (Criteria) this;
        }

        public Criteria andPropagationIdNotBetween(Long value1, Long value2) {
            addCriterion("PROPAGATION_ID not between", value1, value2, "propagationId");
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

        public Criteria andSummaryIsNull() {
            addCriterion("SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("SUMMARY =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("SUMMARY <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("SUMMARY >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("SUMMARY <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("SUMMARY like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("SUMMARY not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("SUMMARY in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("SUMMARY not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("SUMMARY between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("SUMMARY not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andImageUrlListIsNull() {
            addCriterion("IMAGE_URL_LIST is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlListIsNotNull() {
            addCriterion("IMAGE_URL_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlListEqualTo(String value) {
            addCriterion("IMAGE_URL_LIST =", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListNotEqualTo(String value) {
            addCriterion("IMAGE_URL_LIST <>", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListGreaterThan(String value) {
            addCriterion("IMAGE_URL_LIST >", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_URL_LIST >=", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListLessThan(String value) {
            addCriterion("IMAGE_URL_LIST <", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_URL_LIST <=", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListLike(String value) {
            addCriterion("IMAGE_URL_LIST like", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListNotLike(String value) {
            addCriterion("IMAGE_URL_LIST not like", value, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListIn(List<String> values) {
            addCriterion("IMAGE_URL_LIST in", values, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListNotIn(List<String> values) {
            addCriterion("IMAGE_URL_LIST not in", values, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListBetween(String value1, String value2) {
            addCriterion("IMAGE_URL_LIST between", value1, value2, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andImageUrlListNotBetween(String value1, String value2) {
            addCriterion("IMAGE_URL_LIST not between", value1, value2, "imageUrlList");
            return (Criteria) this;
        }

        public Criteria andSourceSiteIsNull() {
            addCriterion("SOURCE_SITE is null");
            return (Criteria) this;
        }

        public Criteria andSourceSiteIsNotNull() {
            addCriterion("SOURCE_SITE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceSiteEqualTo(String value) {
            addCriterion("SOURCE_SITE =", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteNotEqualTo(String value) {
            addCriterion("SOURCE_SITE <>", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteGreaterThan(String value) {
            addCriterion("SOURCE_SITE >", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_SITE >=", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteLessThan(String value) {
            addCriterion("SOURCE_SITE <", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_SITE <=", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteLike(String value) {
            addCriterion("SOURCE_SITE like", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteNotLike(String value) {
            addCriterion("SOURCE_SITE not like", value, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteIn(List<String> values) {
            addCriterion("SOURCE_SITE in", values, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteNotIn(List<String> values) {
            addCriterion("SOURCE_SITE not in", values, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteBetween(String value1, String value2) {
            addCriterion("SOURCE_SITE between", value1, value2, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andSourceSiteNotBetween(String value1, String value2) {
            addCriterion("SOURCE_SITE not between", value1, value2, "sourceSite");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIsNull() {
            addCriterion("ORIGINAL_URL is null");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIsNotNull() {
            addCriterion("ORIGINAL_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlEqualTo(String value) {
            addCriterion("ORIGINAL_URL =", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotEqualTo(String value) {
            addCriterion("ORIGINAL_URL <>", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlGreaterThan(String value) {
            addCriterion("ORIGINAL_URL >", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_URL >=", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLessThan(String value) {
            addCriterion("ORIGINAL_URL <", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_URL <=", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlLike(String value) {
            addCriterion("ORIGINAL_URL like", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotLike(String value) {
            addCriterion("ORIGINAL_URL not like", value, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlIn(List<String> values) {
            addCriterion("ORIGINAL_URL in", values, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotIn(List<String> values) {
            addCriterion("ORIGINAL_URL not in", values, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlBetween(String value1, String value2) {
            addCriterion("ORIGINAL_URL between", value1, value2, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andOriginalUrlNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_URL not between", value1, value2, "originalUrl");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("RELEASE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("RELEASE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("RELEASE_TIME =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("RELEASE_TIME <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("RELEASE_TIME >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RELEASE_TIME >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("RELEASE_TIME <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("RELEASE_TIME <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("RELEASE_TIME in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("RELEASE_TIME not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("RELEASE_TIME between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("RELEASE_TIME not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeIsNull() {
            addCriterion("CRAWL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeIsNotNull() {
            addCriterion("CRAWL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeEqualTo(Date value) {
            addCriterion("CRAWL_TIME =", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeNotEqualTo(Date value) {
            addCriterion("CRAWL_TIME <>", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeGreaterThan(Date value) {
            addCriterion("CRAWL_TIME >", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRAWL_TIME >=", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeLessThan(Date value) {
            addCriterion("CRAWL_TIME <", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRAWL_TIME <=", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeIn(List<Date> values) {
            addCriterion("CRAWL_TIME in", values, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeNotIn(List<Date> values) {
            addCriterion("CRAWL_TIME not in", values, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeBetween(Date value1, Date value2) {
            addCriterion("CRAWL_TIME between", value1, value2, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRAWL_TIME not between", value1, value2, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNull() {
            addCriterion("MEDIA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNotNull() {
            addCriterion("MEDIA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeEqualTo(String value) {
            addCriterion("MEDIA_TYPE =", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotEqualTo(String value) {
            addCriterion("MEDIA_TYPE <>", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThan(String value) {
            addCriterion("MEDIA_TYPE >", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_TYPE >=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThan(String value) {
            addCriterion("MEDIA_TYPE <", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_TYPE <=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLike(String value) {
            addCriterion("MEDIA_TYPE like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotLike(String value) {
            addCriterion("MEDIA_TYPE not like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIn(List<String> values) {
            addCriterion("MEDIA_TYPE in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotIn(List<String> values) {
            addCriterion("MEDIA_TYPE not in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeBetween(String value1, String value2) {
            addCriterion("MEDIA_TYPE between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotBetween(String value1, String value2) {
            addCriterion("MEDIA_TYPE not between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andPolarityIsNull() {
            addCriterion("POLARITY is null");
            return (Criteria) this;
        }

        public Criteria andPolarityIsNotNull() {
            addCriterion("POLARITY is not null");
            return (Criteria) this;
        }

        public Criteria andPolarityEqualTo(String value) {
            addCriterion("POLARITY =", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityNotEqualTo(String value) {
            addCriterion("POLARITY <>", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityGreaterThan(String value) {
            addCriterion("POLARITY >", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityGreaterThanOrEqualTo(String value) {
            addCriterion("POLARITY >=", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityLessThan(String value) {
            addCriterion("POLARITY <", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityLessThanOrEqualTo(String value) {
            addCriterion("POLARITY <=", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityLike(String value) {
            addCriterion("POLARITY like", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityNotLike(String value) {
            addCriterion("POLARITY not like", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityIn(List<String> values) {
            addCriterion("POLARITY in", values, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityNotIn(List<String> values) {
            addCriterion("POLARITY not in", values, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityBetween(String value1, String value2) {
            addCriterion("POLARITY between", value1, value2, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityNotBetween(String value1, String value2) {
            addCriterion("POLARITY not between", value1, value2, "polarity");
            return (Criteria) this;
        }

        public Criteria andExponentIsNull() {
            addCriterion("EXPONENT is null");
            return (Criteria) this;
        }

        public Criteria andExponentIsNotNull() {
            addCriterion("EXPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andExponentEqualTo(String value) {
            addCriterion("EXPONENT =", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentNotEqualTo(String value) {
            addCriterion("EXPONENT <>", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentGreaterThan(String value) {
            addCriterion("EXPONENT >", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentGreaterThanOrEqualTo(String value) {
            addCriterion("EXPONENT >=", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentLessThan(String value) {
            addCriterion("EXPONENT <", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentLessThanOrEqualTo(String value) {
            addCriterion("EXPONENT <=", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentLike(String value) {
            addCriterion("EXPONENT like", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentNotLike(String value) {
            addCriterion("EXPONENT not like", value, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentIn(List<String> values) {
            addCriterion("EXPONENT in", values, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentNotIn(List<String> values) {
            addCriterion("EXPONENT not in", values, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentBetween(String value1, String value2) {
            addCriterion("EXPONENT between", value1, value2, "exponent");
            return (Criteria) this;
        }

        public Criteria andExponentNotBetween(String value1, String value2) {
            addCriterion("EXPONENT not between", value1, value2, "exponent");
            return (Criteria) this;
        }

        public Criteria andHeatIsNull() {
            addCriterion("HEAT is null");
            return (Criteria) this;
        }

        public Criteria andHeatIsNotNull() {
            addCriterion("HEAT is not null");
            return (Criteria) this;
        }

        public Criteria andHeatEqualTo(String value) {
            addCriterion("HEAT =", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotEqualTo(String value) {
            addCriterion("HEAT <>", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThan(String value) {
            addCriterion("HEAT >", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatGreaterThanOrEqualTo(String value) {
            addCriterion("HEAT >=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThan(String value) {
            addCriterion("HEAT <", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLessThanOrEqualTo(String value) {
            addCriterion("HEAT <=", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatLike(String value) {
            addCriterion("HEAT like", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotLike(String value) {
            addCriterion("HEAT not like", value, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatIn(List<String> values) {
            addCriterion("HEAT in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotIn(List<String> values) {
            addCriterion("HEAT not in", values, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatBetween(String value1, String value2) {
            addCriterion("HEAT between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andHeatNotBetween(String value1, String value2) {
            addCriterion("HEAT not between", value1, value2, "heat");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNull() {
            addCriterion("BROWSE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIsNotNull() {
            addCriterion("BROWSE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseCountEqualTo(Long value) {
            addCriterion("BROWSE_COUNT =", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotEqualTo(Long value) {
            addCriterion("BROWSE_COUNT <>", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThan(Long value) {
            addCriterion("BROWSE_COUNT >", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountGreaterThanOrEqualTo(Long value) {
            addCriterion("BROWSE_COUNT >=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThan(Long value) {
            addCriterion("BROWSE_COUNT <", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountLessThanOrEqualTo(Long value) {
            addCriterion("BROWSE_COUNT <=", value, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountIn(List<Long> values) {
            addCriterion("BROWSE_COUNT in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotIn(List<Long> values) {
            addCriterion("BROWSE_COUNT not in", values, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountBetween(Long value1, Long value2) {
            addCriterion("BROWSE_COUNT between", value1, value2, "browseCount");
            return (Criteria) this;
        }

        public Criteria andBrowseCountNotBetween(Long value1, Long value2) {
            addCriterion("BROWSE_COUNT not between", value1, value2, "browseCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNull() {
            addCriterion("REPLY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andReplyCountIsNotNull() {
            addCriterion("REPLY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReplyCountEqualTo(Long value) {
            addCriterion("REPLY_COUNT =", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotEqualTo(Long value) {
            addCriterion("REPLY_COUNT <>", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThan(Long value) {
            addCriterion("REPLY_COUNT >", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountGreaterThanOrEqualTo(Long value) {
            addCriterion("REPLY_COUNT >=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThan(Long value) {
            addCriterion("REPLY_COUNT <", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountLessThanOrEqualTo(Long value) {
            addCriterion("REPLY_COUNT <=", value, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountIn(List<Long> values) {
            addCriterion("REPLY_COUNT in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotIn(List<Long> values) {
            addCriterion("REPLY_COUNT not in", values, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountBetween(Long value1, Long value2) {
            addCriterion("REPLY_COUNT between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andReplyCountNotBetween(Long value1, Long value2) {
            addCriterion("REPLY_COUNT not between", value1, value2, "replyCount");
            return (Criteria) this;
        }

        public Criteria andIsCollectionIsNull() {
            addCriterion("IS_COLLECTION is null");
            return (Criteria) this;
        }

        public Criteria andIsCollectionIsNotNull() {
            addCriterion("IS_COLLECTION is not null");
            return (Criteria) this;
        }

        public Criteria andIsCollectionEqualTo(String value) {
            addCriterion("IS_COLLECTION =", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionNotEqualTo(String value) {
            addCriterion("IS_COLLECTION <>", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionGreaterThan(String value) {
            addCriterion("IS_COLLECTION >", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionGreaterThanOrEqualTo(String value) {
            addCriterion("IS_COLLECTION >=", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionLessThan(String value) {
            addCriterion("IS_COLLECTION <", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionLessThanOrEqualTo(String value) {
            addCriterion("IS_COLLECTION <=", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionLike(String value) {
            addCriterion("IS_COLLECTION like", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionNotLike(String value) {
            addCriterion("IS_COLLECTION not like", value, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionIn(List<String> values) {
            addCriterion("IS_COLLECTION in", values, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionNotIn(List<String> values) {
            addCriterion("IS_COLLECTION not in", values, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionBetween(String value1, String value2) {
            addCriterion("IS_COLLECTION between", value1, value2, "isCollection");
            return (Criteria) this;
        }

        public Criteria andIsCollectionNotBetween(String value1, String value2) {
            addCriterion("IS_COLLECTION not between", value1, value2, "isCollection");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlIsNull() {
            addCriterion("MAIN_BODY_URL is null");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlIsNotNull() {
            addCriterion("MAIN_BODY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlEqualTo(String value) {
            addCriterion("MAIN_BODY_URL =", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlNotEqualTo(String value) {
            addCriterion("MAIN_BODY_URL <>", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlGreaterThan(String value) {
            addCriterion("MAIN_BODY_URL >", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_BODY_URL >=", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlLessThan(String value) {
            addCriterion("MAIN_BODY_URL <", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlLessThanOrEqualTo(String value) {
            addCriterion("MAIN_BODY_URL <=", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlLike(String value) {
            addCriterion("MAIN_BODY_URL like", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlNotLike(String value) {
            addCriterion("MAIN_BODY_URL not like", value, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlIn(List<String> values) {
            addCriterion("MAIN_BODY_URL in", values, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlNotIn(List<String> values) {
            addCriterion("MAIN_BODY_URL not in", values, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlBetween(String value1, String value2) {
            addCriterion("MAIN_BODY_URL between", value1, value2, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andMainBodyUrlNotBetween(String value1, String value2) {
            addCriterion("MAIN_BODY_URL not between", value1, value2, "mainBodyUrl");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("TOPIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("TOPIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(String value) {
            addCriterion("TOPIC_ID =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(String value) {
            addCriterion("TOPIC_ID <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(String value) {
            addCriterion("TOPIC_ID >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(String value) {
            addCriterion("TOPIC_ID >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(String value) {
            addCriterion("TOPIC_ID <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(String value) {
            addCriterion("TOPIC_ID <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLike(String value) {
            addCriterion("TOPIC_ID like", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotLike(String value) {
            addCriterion("TOPIC_ID not like", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<String> values) {
            addCriterion("TOPIC_ID in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<String> values) {
            addCriterion("TOPIC_ID not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(String value1, String value2) {
            addCriterion("TOPIC_ID between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(String value1, String value2) {
            addCriterion("TOPIC_ID not between", value1, value2, "topicId");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
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
package test.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "T_KL_YQ_INFO")
public class YqInfo {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name="",sequenceName="select SEQ_KL_YQ_INFO_ID.NEXTVAL AS ID from dual")
    private BigDecimal id;

    @Column(name = "YQ_ID")
    private String yqId;

    @Column(name = "USER_ID")
    private BigDecimal userId;

    @Column(name = "PROPAGATION_ID")
    private BigDecimal propagationId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "SUMMARY")
    private String summary;

    @Column(name = "IMAGE_URL_LIST")
    private String imageUrlList;

    @Column(name = "SOURCE_SITE")
    private String sourceSite;

    @Column(name = "ORIGINAL_URL")
    private String originalUrl;

    @Column(name = "RELEASE_TIME")
    private Date releaseTime;

    @Column(name = "CRAWL_TIME")
    private Date crawlTime;

    @Column(name = "MEDIA_TYPE")
    private String mediaType;

    @Column(name = "POLARITY")
    private String polarity;

    @Column(name = "EXPONENT")
    private String exponent;

    @Column(name = "HEAT")
    private String heat;

    @Column(name = "BROWSE_COUNT")
    private BigDecimal browseCount;

    @Column(name = "REPLY_COUNT")
    private BigDecimal replyCount;

    @Column(name = "IS_COLLECTION")
    private String isCollection;

    @Column(name = "MAIN_BODY_URL")
    private String mainBodyUrl;

    @Column(name = "TOPIC_ID")
    private String topicId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "MODIFY_TIME")
    private Date modifyTime;

    @Column(name = "TEXT_INFO")
    private String textInfo;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return YQ_ID
     */
    public String getYqId() {
        return yqId;
    }

    /**
     * @param yqId
     */
    public void setYqId(String yqId) {
        this.yqId = yqId;
    }

    /**
     * @return USER_ID
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * @return PROPAGATION_ID
     */
    public BigDecimal getPropagationId() {
        return propagationId;
    }

    /**
     * @param propagationId
     */
    public void setPropagationId(BigDecimal propagationId) {
        this.propagationId = propagationId;
    }

    /**
     * @return TITLE
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return SUMMARY
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return IMAGE_URL_LIST
     */
    public String getImageUrlList() {
        return imageUrlList;
    }

    /**
     * @param imageUrlList
     */
    public void setImageUrlList(String imageUrlList) {
        this.imageUrlList = imageUrlList;
    }

    /**
     * @return SOURCE_SITE
     */
    public String getSourceSite() {
        return sourceSite;
    }

    /**
     * @param sourceSite
     */
    public void setSourceSite(String sourceSite) {
        this.sourceSite = sourceSite;
    }

    /**
     * @return ORIGINAL_URL
     */
    public String getOriginalUrl() {
        return originalUrl;
    }

    /**
     * @param originalUrl
     */
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    /**
     * @return RELEASE_TIME
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * @param releaseTime
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * @return CRAWL_TIME
     */
    public Date getCrawlTime() {
        return crawlTime;
    }

    /**
     * @param crawlTime
     */
    public void setCrawlTime(Date crawlTime) {
        this.crawlTime = crawlTime;
    }

    /**
     * @return MEDIA_TYPE
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * @param mediaType
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * @return POLARITY
     */
    public String getPolarity() {
        return polarity;
    }

    /**
     * @param polarity
     */
    public void setPolarity(String polarity) {
        this.polarity = polarity;
    }

    /**
     * @return EXPONENT
     */
    public String getExponent() {
        return exponent;
    }

    /**
     * @param exponent
     */
    public void setExponent(String exponent) {
        this.exponent = exponent;
    }

    /**
     * @return HEAT
     */
    public String getHeat() {
        return heat;
    }

    /**
     * @param heat
     */
    public void setHeat(String heat) {
        this.heat = heat;
    }

    /**
     * @return BROWSE_COUNT
     */
    public BigDecimal getBrowseCount() {
        return browseCount;
    }

    /**
     * @param browseCount
     */
    public void setBrowseCount(BigDecimal browseCount) {
        this.browseCount = browseCount;
    }

    /**
     * @return REPLY_COUNT
     */
    public BigDecimal getReplyCount() {
        return replyCount;
    }

    /**
     * @param replyCount
     */
    public void setReplyCount(BigDecimal replyCount) {
        this.replyCount = replyCount;
    }

    /**
     * @return IS_COLLECTION
     */
    public String getIsCollection() {
        return isCollection;
    }

    /**
     * @param isCollection
     */
    public void setIsCollection(String isCollection) {
        this.isCollection = isCollection;
    }

    /**
     * @return MAIN_BODY_URL
     */
    public String getMainBodyUrl() {
        return mainBodyUrl;
    }

    /**
     * @param mainBodyUrl
     */
    public void setMainBodyUrl(String mainBodyUrl) {
        this.mainBodyUrl = mainBodyUrl;
    }

    /**
     * @return TOPIC_ID
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * @param topicId
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return MODIFY_TIME
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * @return TEXT_INFO
     */
    public String getTextInfo() {
        return textInfo;
    }

    /**
     * @param textInfo
     */
    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }
}
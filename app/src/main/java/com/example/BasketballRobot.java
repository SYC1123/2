package com.example;

import java.util.List;

public class BasketballRobot {

    /**
     * reason : 查询成功
     * result : {"title":"","list":[{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467243%26ptag%3D360.onebox.team.nba&m=29a253&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467243%26title%3D%E5%87%AF%E5%B0%94%E7%89%B9%E4%BA%BAVS%E7%83%AD%E7%81%AB&m=8ee053&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D2%26ptag%3D360.onebox.team.nba&m=49447c&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-01 周二 08:30","player1":"凯尔特人","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/2.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D2%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=bbcd61&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/01 08:30","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467265%26ptag%3D360.onebox.team.nba&m=41740a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467265%26title%3D%E9%9B%B7%E9%9C%86VS%E7%83%AD%E7%81%AB&m=fd1eae&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D25%26ptag%3D360.onebox.team.nba&m=6f73e0&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-04 周五 08:00","player1":"雷霆","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/25.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D25%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=419354&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/04 08:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467279%26ptag%3D360.onebox.team.nba&m=9959b5&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467279%26title%3D%E9%AA%91%E5%A3%ABVS%E7%83%AD%E7%81%AB&m=bbdfbf&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D5%26ptag%3D360.onebox.team.nba&m=3295a8&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-06 周日 09:00","player1":"骑士","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/5.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D5%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=eba5a5&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/06 09:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467942%26ptag%3D360.onebox.team.nba&m=f1c17d&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467942%26title%3D%E5%A5%87%E6%89%8DVS%E7%83%AD%E7%81%AB&m=311591&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D27%26ptag%3D360.onebox.team.nba&m=8db718&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-08 周二 08:30","player1":"奇才","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/27.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D27%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=d032f5&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/08 08:30","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467956%26ptag%3D360.onebox.team.nba&m=04ef20&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467956%26title%3D%E7%83%AD%E7%81%ABVS%E9%BB%84%E8%9C%82&m=eced8c&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D30%26ptag%3D360.onebox.team.nba&m=b949b0&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-10 周四 08:00","player1":"热火","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"黄蜂","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/30.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D5312%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=626eac&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/10 08:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467968%26ptag%3D360.onebox.team.nba&m=a55483&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467968%26title%3D%E7%83%AD%E7%81%ABVS%E6%AD%A5%E8%A1%8C%E8%80%85&m=7e0eaa&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D11%26ptag%3D360.onebox.team.nba&m=3e5cc4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-12 周六 08:00","player1":"热火","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"步行者","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/11.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D11%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=c82f56&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/12 08:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""}],"more1":{"link":""},"more2":{"link":""}}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * title :
         * list : [{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467243%26ptag%3D360.onebox.team.nba&m=29a253&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467243%26title%3D%E5%87%AF%E5%B0%94%E7%89%B9%E4%BA%BAVS%E7%83%AD%E7%81%AB&m=8ee053&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D2%26ptag%3D360.onebox.team.nba&m=49447c&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-01 周二 08:30","player1":"凯尔特人","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/2.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D2%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=bbcd61&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/01 08:30","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467265%26ptag%3D360.onebox.team.nba&m=41740a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467265%26title%3D%E9%9B%B7%E9%9C%86VS%E7%83%AD%E7%81%AB&m=fd1eae&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D25%26ptag%3D360.onebox.team.nba&m=6f73e0&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-04 周五 08:00","player1":"雷霆","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/25.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D25%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=419354&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/04 08:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467279%26ptag%3D360.onebox.team.nba&m=9959b5&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467279%26title%3D%E9%AA%91%E5%A3%ABVS%E7%83%AD%E7%81%AB&m=bbdfbf&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D5%26ptag%3D360.onebox.team.nba&m=3295a8&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-06 周日 09:00","player1":"骑士","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/5.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D5%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=eba5a5&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/06 09:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467942%26ptag%3D360.onebox.team.nba&m=f1c17d&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467942%26title%3D%E5%A5%87%E6%89%8DVS%E7%83%AD%E7%81%AB&m=311591&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D27%26ptag%3D360.onebox.team.nba&m=8db718&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-08 周二 08:30","player1":"奇才","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/27.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D27%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=d032f5&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"热火","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/08 08:30","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467956%26ptag%3D360.onebox.team.nba&m=04ef20&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467956%26title%3D%E7%83%AD%E7%81%ABVS%E9%BB%84%E8%9C%82&m=eced8c&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D30%26ptag%3D360.onebox.team.nba&m=b949b0&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-10 周四 08:00","player1":"热火","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"黄蜂","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/30.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D5312%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=626eac&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/10 08:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""},{"link1text":"视频直播","link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467968%26ptag%3D360.onebox.team.nba&m=a55483&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","link2text":"技术统计","link2url":"","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467968%26title%3D%E7%83%AD%E7%81%ABVS%E6%AD%A5%E8%A1%8C%E8%80%85&m=7e0eaa&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_link2url":"","m_player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D11%26ptag%3D360.onebox.team.nba&m=3e5cc4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","m_time":"12-12 周六 08:00","player1":"热火","player1logo":"http://mat1.gtimg.com/sports/nba/logo/78/14.png","player1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","player2":"步行者","player2logo":"http://mat1.gtimg.com/sports/nba/logo/78/11.png","player2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D11%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=c82f56&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc","score":"VS","status":"0","time":"12/12 08:00","c4T1URL":"","c4T2URL":"","c52Link":"","c53Link":"","c54Link":""}]
         * more1 : {"link":""}
         * more2 : {"link":""}
         */

        private String title;
        private More1Bean more1;
        private More2Bean more2;
        private List<ListBean> list;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public More1Bean getMore1() {
            return more1;
        }

        public void setMore1(More1Bean more1) {
            this.more1 = more1;
        }

        public More2Bean getMore2() {
            return more2;
        }

        public void setMore2(More2Bean more2) {
            this.more2 = more2;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class More1Bean {
            /**
             * link :
             */

            private String link;

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }

        public static class More2Bean {
            /**
             * link :
             */

            private String link;

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }
        }

        public static class ListBean {
            /**
             * link1text : 视频直播
             * link1url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fgame.htm%3Fmid%3D100000%3A1467243%26ptag%3D360.onebox.team.nba&m=29a253&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc
             * link2text : 技术统计
             * link2url :
             * m_link1url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1467243%26title%3D%E5%87%AF%E5%B0%94%E7%89%B9%E4%BA%BAVS%E7%83%AD%E7%81%AB&m=8ee053&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc
             * m_link2url :
             * m_player1url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D2%26ptag%3D360.onebox.team.nba&m=49447c&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc
             * m_player2url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fteam.htm%3Fcid%3D100000%26tid%3D14%26ptag%3D360.onebox.team.nba&m=f6e68a&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc
             * m_time : 12-01 周二 08:30
             * player1 : 凯尔特人
             * player1logo : http://mat1.gtimg.com/sports/nba/logo/78/2.png
             * player1url : http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D2%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=bbcd61&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc
             * player2 : 热火
             * player2logo : http://mat1.gtimg.com/sports/nba/logo/78/14.png
             * player2url : http://j.www.haosou.com/?u=http%3A%2F%2Fkbs.sports.qq.com%2Fkbsweb%2Fteams.htm%3Ftid%3D14%26cid%3D100000%3Fptag%3D360.onebox.team.nba&m=dc28f4&from=juhe&type=nba_team&juid=JHb484735682b80413b7f16def295c3aa6&d=pc
             * score : VS
             * status : 0
             * time : 12/01 08:30
             * c4T1URL :
             * c4T2URL :
             * c52Link :
             * c53Link :
             * c54Link :
             */

            private String link1text;
            private String link1url;
            private String link2text;
            private String link2url;
            private String m_link1url;
            private String m_link2url;
            private String m_player1url;
            private String m_player2url;
            private String m_time;
            private String player1;
            private String player1logo;
            private String player1url;
            private String player2;
            private String player2logo;
            private String player2url;
            private String score;
            private String status;
            private String time;
            private String c4T1URL;
            private String c4T2URL;
            private String c52Link;
            private String c53Link;
            private String c54Link;

            public String getLink1text() {
                return link1text;
            }

            public void setLink1text(String link1text) {
                this.link1text = link1text;
            }

            public String getLink1url() {
                return link1url;
            }

            public void setLink1url(String link1url) {
                this.link1url = link1url;
            }

            public String getLink2text() {
                return link2text;
            }

            public void setLink2text(String link2text) {
                this.link2text = link2text;
            }

            public String getLink2url() {
                return link2url;
            }

            public void setLink2url(String link2url) {
                this.link2url = link2url;
            }

            public String getM_link1url() {
                return m_link1url;
            }

            public void setM_link1url(String m_link1url) {
                this.m_link1url = m_link1url;
            }

            public String getM_link2url() {
                return m_link2url;
            }

            public void setM_link2url(String m_link2url) {
                this.m_link2url = m_link2url;
            }

            public String getM_player1url() {
                return m_player1url;
            }

            public void setM_player1url(String m_player1url) {
                this.m_player1url = m_player1url;
            }

            public String getM_player2url() {
                return m_player2url;
            }

            public void setM_player2url(String m_player2url) {
                this.m_player2url = m_player2url;
            }

            public String getM_time() {
                return m_time;
            }

            public void setM_time(String m_time) {
                this.m_time = m_time;
            }

            public String getPlayer1() {
                return player1;
            }

            public void setPlayer1(String player1) {
                this.player1 = player1;
            }

            public String getPlayer1logo() {
                return player1logo;
            }

            public void setPlayer1logo(String player1logo) {
                this.player1logo = player1logo;
            }

            public String getPlayer1url() {
                return player1url;
            }

            public void setPlayer1url(String player1url) {
                this.player1url = player1url;
            }

            public String getPlayer2() {
                return player2;
            }

            public void setPlayer2(String player2) {
                this.player2 = player2;
            }

            public String getPlayer2logo() {
                return player2logo;
            }

            public void setPlayer2logo(String player2logo) {
                this.player2logo = player2logo;
            }

            public String getPlayer2url() {
                return player2url;
            }

            public void setPlayer2url(String player2url) {
                this.player2url = player2url;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getC4T1URL() {
                return c4T1URL;
            }

            public void setC4T1URL(String c4T1URL) {
                this.c4T1URL = c4T1URL;
            }

            public String getC4T2URL() {
                return c4T2URL;
            }

            public void setC4T2URL(String c4T2URL) {
                this.c4T2URL = c4T2URL;
            }

            public String getC52Link() {
                return c52Link;
            }

            public void setC52Link(String c52Link) {
                this.c52Link = c52Link;
            }

            public String getC53Link() {
                return c53Link;
            }

            public void setC53Link(String c53Link) {
                this.c53Link = c53Link;
            }

            public String getC54Link() {
                return c54Link;
            }

            public void setC54Link(String c54Link) {
                this.c54Link = c54Link;
            }
        }
    }
}

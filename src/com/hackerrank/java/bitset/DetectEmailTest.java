package com.hackerrank.java.bitset;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.jupiter.api.Assertions.*;

class DetectEmailTest {

  @Test
  void main() throws IOException {
    String mock = "ads.indiatimes.com;ads2book.com;adscontent2.indiatimes.com;advertise.indiatimes.com;ahmedabadmirror.com;astrospeak.com;b.scorecardresearch.com;bangaloremirror.com;base.google.com;boxtv.com;brandcapital.co.in;cmstrendslog.indiatimes.com;content.magicbricks.com;download.macromedia.com;economictimes.indiatimes.com;email.indiatimes.com;entertainment.timesofindia.com;epaper.timesofindia.com;facebook.com;files.adspdbl.com;gaana.com;gogreenindia.co.in;graph.facebook.com;gujarati.economictimes.indiatimes.com;guylife.com;healthmeup.com;hindi.economictimes.indiatimes.com;hotklix.com;ibeat.indiatimes.com;idiva.com;indiatimes.com;itn.ph.affinity.com;itsmyascent.com;luxpresso.com;m.timesofindia.com;macromedia.com;magicbricks.com;maharashtratimes.indiatimes.com;mobile.indiatimes.com;mocolife.com;mumbaimirror.com;myeducationtimes.com;myt.indiatimes.com;mytimes.indiatimes.com;navbharattimes.indiatimes.com;netspiderads2.indiatimes.com;netspiderads3.indiatimes.com;netspideradswc.indiatimes.com;ogp.me;photogallery.indiatimes.com;plus.google.com;profile.live.com;punemirror.in;s3.amazonaws.com;salescrm.indiatimes.com;shopping.indiatimes.com;simplymarry.com;ssl.gstatic.com;static.rewards.indiatimes.com;tags.crwdcntrl.net;techgig.com;technoholik.com;tenders.indiatimes.com;timescity.com;timescontent.com;timescrest.com;timesdeal.com;timesinternet.in;timesjobs.com;timeslog.indiatimes.com;timesnow.live.indiatimes.com;timesnow.tv;timesofindia.hotklix.com;timesofindia.indiatimes.com;timesofindia.speakingtree.in;timesofmoney.com;timestrends.indiatimes.com;twitter.com;vijaykarnataka.indiatimes.com;w3.org;webuild.indiatimes.com;widgets.outbrain.com;ww.itimes.com;yolist.com;zigwheels.com;zoomtv.in";
    String[] split = mock.split(";");
    Set<String> mocks = new TreeSet<>(Arrays.asList(split));
    Set<String> run = DetectEmail.run();
    List<String> listMock = new ArrayList<>(mocks);
    List<String> listRun = new ArrayList<>(run);
    for (int i = 0; i < listMock.size() - 1; i++) {
      assertThat(listRun.get(i), is(listMock.get(i)));
    }
  }
}
package org.bigbluebutton.app.screenshare.events;

public class ScreenShareStartedEvent implements IEvent {

  public final String meetingId;
  public final String streamId;
  public final int width;
  public final int height;
  public final String url;
  
  public ScreenShareStartedEvent(String meetingId, String streamId,
                                 int width, int height, String url) {
    this.meetingId = meetingId;
    this.streamId = streamId;
    this.width = width;
    this.height = height;
    this.url = url;
  }
}

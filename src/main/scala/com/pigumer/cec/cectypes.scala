package com.pigumer.cec

// from: https://github.com/Pulse-Eight/libcec/blob/master/include/cectypes.h

sealed abstract class LogicalAddress(address: Int)

object LogicalAddress {

  case object CECDEVICE_UNKNOWN extends LogicalAddress(-1) //not a valid logical address

  case object CECDEVICE_TV extends LogicalAddress(0)

  case object CECDEVICE_RECORDINGDEVICE1 extends LogicalAddress(1)

  case object CECDEVICE_RECORDINGDEVICE2 extends LogicalAddress(2)

  case object CECDEVICE_TUNER1 extends LogicalAddress(3)

  case object CECDEVICE_PLAYBACKDEVICE1 extends LogicalAddress(4)

  case object CECDEVICE_AUDIOSYSTEM extends LogicalAddress(5)

  case object CECDEVICE_TUNER2 extends LogicalAddress(6)

  case object CECDEVICE_TUNER3 extends LogicalAddress(7)

  case object CECDEVICE_PLAYBACKDEVICE2 extends LogicalAddress(8)

  case object CECDEVICE_RECORDINGDEVICE3 extends LogicalAddress(9)

  case object CECDEVICE_TUNER4 extends LogicalAddress(10)

  case object CECDEVICE_PLAYBACKDEVICE3 extends LogicalAddress(11)

  case object CECDEVICE_RESERVED1 extends LogicalAddress(12)

  case object CECDEVICE_RESERVED2 extends LogicalAddress(13)

  case object CECDEVICE_FREEUSE extends LogicalAddress(14)

  case object CECDEVICE_UNREGISTERED extends LogicalAddress(15)

  case object CECDEVICE_BROADCAST extends LogicalAddress(15)

}

sealed abstract class Opcode(code: Int)

object Opcode {

  case object CEC_OPCODE_ACTIVE_SOURCE extends Opcode(0x82)

  case object CEC_OPCODE_IMAGE_VIEW_ON extends Opcode(0x04)

  case object CEC_OPCODE_TEXT_VIEW_ON extends Opcode(0x0D)

  case object CEC_OPCODE_INACTIVE_SOURCE extends Opcode(0x9D)

  case object CEC_OPCODE_REQUEST_ACTIVE_SOURCE extends Opcode(0x85)

  case object CEC_OPCODE_ROUTING_CHANGE extends Opcode(0x80)

  case object CEC_OPCODE_ROUTING_INFORMATION extends Opcode(0x81)

  case object CEC_OPCODE_SET_STREAM_PATH extends Opcode(0x86)

  case object CEC_OPCODE_STANDBY extends Opcode(0x36)

  case object CEC_OPCODE_RECORD_OFF extends Opcode(0x0B)

  case object CEC_OPCODE_RECORD_ON extends Opcode(0x09)

  case object CEC_OPCODE_RECORD_STATUS extends Opcode(0x0A)

  case object CEC_OPCODE_RECORD_TV_SCREEN extends Opcode(0x0F)

  case object CEC_OPCODE_CLEAR_ANALOGUE_TIMER extends Opcode(0x33)

  case object CEC_OPCODE_CLEAR_DIGITAL_TIMER extends Opcode(0x99)

  case object CEC_OPCODE_CLEAR_EXTERNAL_TIMER extends Opcode(0xA1)

  case object CEC_OPCODE_SET_ANALOGUE_TIMER extends Opcode(0x34)

  case object CEC_OPCODE_SET_DIGITAL_TIMER extends Opcode(0x97)

  case object CEC_OPCODE_SET_EXTERNAL_TIMER extends Opcode(0xA2)

  case object CEC_OPCODE_SET_TIMER_PROGRAM_TITLE extends Opcode(0x67)

  case object CEC_OPCODE_TIMER_CLEARED_STATUS extends Opcode(0x43)

  case object CEC_OPCODE_TIMER_STATUS extends Opcode(0x35)

  case object CEC_OPCODE_CEC_VERSION extends Opcode(0x9E)

  case object CEC_OPCODE_GET_CEC_VERSION extends Opcode(0x9F)

  case object CEC_OPCODE_GIVE_PHYSICAL_ADDRESS extends Opcode(0x83)

  case object CEC_OPCODE_GET_MENU_LANGUAGE extends Opcode(0x91)

  case object CEC_OPCODE_REPORT_PHYSICAL_ADDRESS extends Opcode(0x84)

  case object CEC_OPCODE_SET_MENU_LANGUAGE extends Opcode(0x32)

  case object CEC_OPCODE_DECK_CONTROL extends Opcode(0x42)

  case object CEC_OPCODE_DECK_STATUS extends Opcode(0x1B)

  case object CEC_OPCODE_GIVE_DECK_STATUS extends Opcode(0x1A)

  case object CEC_OPCODE_PLAY extends Opcode(0x41)

  case object CEC_OPCODE_GIVE_TUNER_DEVICE_STATUS extends Opcode(0x08)

  case object CEC_OPCODE_SELECT_ANALOGUE_SERVICE extends Opcode(0x92)

  case object CEC_OPCODE_SELECT_DIGITAL_SERVICE extends Opcode(0x93)

  case object CEC_OPCODE_TUNER_DEVICE_STATUS extends Opcode(0x07)

  case object CEC_OPCODE_TUNER_STEP_DECREMENT extends Opcode(0x06)

  case object CEC_OPCODE_TUNER_STEP_INCREMENT extends Opcode(0x05)

  case object CEC_OPCODE_DEVICE_VENDOR_ID extends Opcode(0x87)

  case object CEC_OPCODE_GIVE_DEVICE_VENDOR_ID extends Opcode(0x8C)

  case object CEC_OPCODE_VENDOR_COMMAND extends Opcode(0x89)

  case object CEC_OPCODE_VENDOR_COMMAND_WITH_ID extends Opcode(0xA0)

  case object CEC_OPCODE_VENDOR_REMOTE_BUTTON_DOWN extends Opcode(0x8A)

  case object CEC_OPCODE_VENDOR_REMOTE_BUTTON_UP extends Opcode(0x8B)

  case object CEC_OPCODE_SET_OSD_STRING extends Opcode(0x64)

  case object CEC_OPCODE_GIVE_OSD_NAME extends Opcode(0x46)

  case object CEC_OPCODE_SET_OSD_NAME extends Opcode(0x47)

  case object CEC_OPCODE_MENU_REQUEST extends Opcode(0x8D)

  case object CEC_OPCODE_MENU_STATUS extends Opcode(0x8E)

  case object CEC_OPCODE_USER_CONTROL_PRESSED extends Opcode(0x44)

  case object CEC_OPCODE_USER_CONTROL_RELEASE extends Opcode(0x45)

  case object CEC_OPCODE_GIVE_DEVICE_POWER_STATUS extends Opcode(0x8F)

  case object CEC_OPCODE_REPORT_POWER_STATUS extends Opcode(0x90)

  case object CEC_OPCODE_FEATURE_ABORT extends Opcode(0x00)

  case object CEC_OPCODE_ABORT extends Opcode(0xFF)

  case object CEC_OPCODE_GIVE_AUDIO_STATUS extends Opcode(0x71)

  case object CEC_OPCODE_GIVE_SYSTEM_AUDIO_MODE_STATUS extends Opcode(0x7D)

  case object CEC_OPCODE_REPORT_AUDIO_STATUS extends Opcode(0x7A)

  case object CEC_OPCODE_SET_SYSTEM_AUDIO_MODE extends Opcode(0x72)

  case object CEC_OPCODE_SYSTEM_AUDIO_MODE_REQUEST extends Opcode(0x70)

  case object CEC_OPCODE_SYSTEM_AUDIO_MODE_STATUS extends Opcode(0x7E)

  case object CEC_OPCODE_SET_AUDIO_RATE extends Opcode(0x9A)

  /* CEC 1.4 */
  case object CEC_OPCODE_START_ARC extends Opcode(0xC0)

  case object CEC_OPCODE_REPORT_ARC_STARTED extends Opcode(0xC1)

  case object CEC_OPCODE_REPORT_ARC_ENDED extends Opcode(0xC2)

  case object CEC_OPCODE_REQUEST_ARC_START extends Opcode(0xC3)

  case object CEC_OPCODE_REQUEST_ARC_END extends Opcode(0xC4)

  case object CEC_OPCODE_END_ARC extends Opcode(0xC5)

  case object CEC_OPCODE_CDC extends Opcode(0xF8)

  /* when this opcode is set, no opcode will be sent to the device. this is one of the reserved numbers */
  case object CEC_OPCODE_NONE extends Opcode(0xFD)

}

sealed abstract class PowerStatus(status: Int)

object PowerStatus {

  case object CEC_POWER_STATUS_ON extends PowerStatus(0x00)

  case object CEC_POWER_STATUS_STANDBY extends PowerStatus(0x01)

  case object CEC_POWER_STATUS_IN_TRANSITION_STANDBY_TO_ON extends PowerStatus(0x02)

  case object CEC_POWER_STATUS_IN_TRANSITION_ON_TO_STANDBY extends PowerStatus(0x03)

  case object CEC_POWER_STATUS_UNKNOWN extends PowerStatus(0x99)

}
package com.handicap.control;

import java.sql.SQLException;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.handicap.model.beans.BbsBean;
import com.handicap.model.dao.BbsDAO;

public class Controller {

	// ��������
	private BbsDAO bd;
	// �������� Input_Form

	@RequestMapping("/noticeinputForm")
	public String noticenputForm() {
		return "noticeinput_form";
	}

	// �������� insert
	@RequestMapping("/noticeinsert")
	public String noticeinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", "�������� �Խñ��� �ö󰬽��ϴ�.");
				return "noticeresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:noticenput";
	}

	// List
	@RequestMapping("noticelist")
	public String noticelist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 11) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("noticelist", list);

		}
		return "noticelist";
	}

	// ���� ��
	@RequestMapping("noticeupdateform")
	public String noticeupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "noticeupdate";
	}

	// ����
	@RequestMapping("noticeupdate")
	public String noticeinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/noticelist";
		else
			return "noticeupdateform";
	}
	// ����

	@RequestMapping("noticedeleteform")
	public String noticedeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "noticedeleteform";
	}

	@RequestMapping("noticedelete")
	public String noticedelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/noticelist";
		else
			return "noticedeleteform";
	}

	// �������� ��

	// ����

	// ���� Input_Form

	@RequestMapping("/newsinputForm")
	public String newsinputForm() {
		return "newsinput_form";
	}

	// ���� insert
	@RequestMapping("/newsinsert")
	public String newsinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "newsresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:newsinput";
	}

	// ���� List
	@RequestMapping("newslist")
	public String newslist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("newslist", list);

		}
		return "newslist";
	}

	// ���� ���� ��
	@RequestMapping("newsupdateform")
	public String newsupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "newsupdate";
	}

	// ����
	@RequestMapping("newsupdate")
	public String newsinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/newslist";
		else
			return "newsupdateform";
	}
	// ����

	@RequestMapping("newsdeleteform")
	public String newsdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "newsdeleteform";
	}

	@RequestMapping("newsdelete")
	public String newsdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/newslist";
		else
			return "newsdeleteform";
	}

	// ���� ��

	// ���ڸ� ����
	// Input_Form

	@RequestMapping("/jobinputForm")
	public String jobinputForm() {
		return "jobinput_form";
	}

	// ���ڸ����� insert
	@RequestMapping("/jobinsert")
	public String jobinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "jobresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:jobinput";
	}

	// ���ڸ����� List
	@RequestMapping("joblist")
	public String joblist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("joblist", list);

		}
		return "joblist";
	}

	// ���� ���� ��
	@RequestMapping("jobupdateform")
	public String jobupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "jobupdate";
	}

	// ����
	@RequestMapping("jobupdate")
	public String jobinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/joblist";
		else
			return "jobupdateform";
	}
	// ����

	@RequestMapping("jobdeleteform")
	public String jobdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "jobdeleteform";
	}

	@RequestMapping("jobdelete")
	public String jobdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/joblist";
		else
			return "jobdeleteform";
	}

	// ���ڸ����� ��

	// �Ƿ�-�ŷ�
	// Input_Form

	@RequestMapping("/tradeinputForm")
	public String tradeinputForm() {
		return "tradeinput_form";
	}

	// �Ƿ�-�ŷ� insert
	@RequestMapping("/tradeinsert")
	public String tradeinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "traderesult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:tradeinput";
	}

	// �Ƿ�-�ŷ� List
	@RequestMapping("tradelist")
	public String tradelist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("tradelist", list);

		}
		return "tradelist";
	}

	// �Ƿ�-�ŷ� ���� ��
	@RequestMapping("tradeupdateform")
	public String tradeupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "tradeupdate";
	}

	// ����
	@RequestMapping("tradeupdate")
	public String tradeinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/tradelist";
		else
			return "tradeupdateform";
	}
	// ����

	@RequestMapping("tradedeleteform")
	public String tradedeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "tradedeleteform";
	}

	@RequestMapping("tradedelete")
	public String tradedelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/tradelist";
		else
			return "tradedeleteform";
	}

	// �Ƿ�-�ŷ� ��

	// �Ƿ�-����
	// Input_Form

	@RequestMapping("/questioninputForm")
	public String questioninputForm() {
		return "questioninput_form";
	}

	// �Ƿ�-���� insert
	@RequestMapping("/questioninsert")
	public String questioninsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "questionresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:questioninput";
	}

	// �Ƿ�-���� List
	@RequestMapping("questionlist")
	public String questionlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("questionlist", list);

		}
		return "questionlist";
	}

	// �Ƿ�-���� ���� ��
	@RequestMapping("questionupdateform")
	public String questionupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "questionupdate";
	}

	// ����
	@RequestMapping("questionupdate")
	public String questioninsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/questionlist";
		else
			return "questionupdateform";
	}
	// ����

	@RequestMapping("questiondeleteform")
	public String questiondeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "questiondeleteform";
	}

	@RequestMapping("questiondelete")
	public String questiondelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/questionlist";
		else
			return "questiondeleteform";
	}

	// �Ƿ�-���� ��

	// �Ƿ�-�ı�
	// Input_Form

	@RequestMapping("/reviewinputForm")
	public String reviewinputForm() {
		return "reviewinput_form";
	}

	// �Ƿ�-�ŷ� insert
	@RequestMapping("/reviewinsert")
	public String reviewinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "reviewresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:reviewinput";
	}

	// �Ƿ�-�ı� List
	@RequestMapping("reviewlist")
	public String reviewlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("reviewlist", list);

		}
		return "reviewlist";
	}

	// �Ƿ�-�ı� ���� ��
	@RequestMapping("reviewupdateform")
	public String reviewupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "reviewupdate";
	}

	// ����
	@RequestMapping("reviewupdate")
	public String reviewinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/reviewlist";
		else
			return "reviewupdateform";
	}
	// ����

	@RequestMapping("reviewdeleteform")
	public String reviewdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "reviewdeleteform";
	}

	@RequestMapping("reviewdelete")
	public String reviewdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/reviewlist";
		else
			return "reviewdeleteform";
	}

	// �Ƿ�-�ı� ��

	// �Խ���-��ü���
	// Input_Form

	@RequestMapping("/bodyinputForm")
	public String bodyinputForm() {
		return "bodyinput_form";
	}

	// �Խ���-��ü��� insert
	@RequestMapping("/bodyinsert")
	public String bodyinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "bodyresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:bodyinput";
	}

	// �Խ���-��ü��� List
	@RequestMapping("bodylist")
	public String bodylist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("bodylist", list);

		}
		return "bodylist";
	}

	// �Խ���-��ü��� ���� ��
	@RequestMapping("bodyupdateform")
	public String bodyupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bodyupdate";
	}

	// ����
	@RequestMapping("bodyupdate")
	public String bodyinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/bodylist";
		else
			return "bodyupdateform";
	}
	// ����

	@RequestMapping("bodydeleteform")
	public String bodydeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bodydeleteform";
	}

	@RequestMapping("bodydelete")
	public String bodydelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/bodylist";
		else
			return "bodydeleteform";
	}

	// �Խ���-��ü��� ��

	// �Խ���-�������
	// Input_Form

	@RequestMapping("/mentalinputForm")
	public String mentalinputForm() {
		return "mentalinput_form";
	}

	// �Խ���-������� insert
	@RequestMapping("/mentalinsert")
	public String mentalinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "mentalresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:mentalinput";
	}

	// �Խ���-������� List
	@RequestMapping("mentallist")
	public String mentallist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("mentallist", list);

		}
		return "mentallist";
	}

	// �Խ���-������� ���� ��
	@RequestMapping("mentalupdateform")
	public String mentalupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "mentalupdate";
	}

	// ����
	@RequestMapping("mentalupdate")
	public String mentalinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/mentallist";
		else
			return "mentalupdateform";
	}
	// ����

	@RequestMapping("mentaldeleteform")
	public String mentaldeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "mentaldeleteform";
	}

	@RequestMapping("mentaldelete")
	public String mentaldelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/mentallist";
		else
			return "mentaldeleteform";
	}

	// �Խ���-������� ��

	// �Խ���-��ȣȸ
	// Input_Form

	@RequestMapping("/clubinputForm")
	public String clubinputForm() {
		return "clubinput_form";
	}

	// �Խ���-��ȣȸ insert
	@RequestMapping("/clubinsert")
	public String clubinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "clubresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:clubinput";
	}

	// �Խ���-��ȣȸ List
	@RequestMapping("clublist")
	public String clublist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("clublist", list);

		}
		return "clublist";
	}

	// �Խ���-��ȣȸ ���� ��
	@RequestMapping("clubupdateform")
	public String clubupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "clubupdate";
	}

	// ����
	@RequestMapping("clubupdate")
	public String clubinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/clublist";
		else
			return "clubupdateform";
	}
	// ����

	@RequestMapping("clubdeleteform")
	public String clubdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "clubdeleteform";
	}

	@RequestMapping("clubdelete")
	public String clubdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/clublist";
		else
			return "clubdeleteform";
	}

	// �Խ���-��ȣȸ ��

	// �Խ���-����
	// Input_Form

	@RequestMapping("/travelinputForm")
	public String travelinputForm() {
		return "travelinput_form";
	}

	// �Խ���-���� insert
	@RequestMapping("/travelinsert")
	public String travelinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "travelresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:travelinput";
	}

	// �Խ���-���� List
	@RequestMapping("travellist")
	public String travellist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("travellist", list);

		}
		return "travellist";
	}

	// �Խ���-���� ���� ��
	@RequestMapping("travelupdateform")
	public String travelupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "travelupdate";
	}

	// ����
	@RequestMapping("travelupdate")
	public String travelinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/travellist";
		else
			return "travelupdateform";
	}
	// ����

	@RequestMapping("traveldeleteform")
	public String traveldeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "traveldeleteform";
	}

	@RequestMapping("traveldelete")
	public String traveldelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/travellist";
		else
			return "traveldeleteform";
	}

	// �Խ���-���� ��

	// ������-Q&A
	// Input_Form

	@RequestMapping("/qnainputForm")
	public String qnainputForm() {
		return "qnainput_form";
	}

	// ������-Q&A insert
	@RequestMapping("/qnainsert")
	public String qnainsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "qnaresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:qnainput";
	}

	// ������-Q&A List
	@RequestMapping("qnalist")
	public String qnalist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("qnalist", list);

		}
		return "qnalist";
	}

	// ������-Q&A ���� ��
	@RequestMapping("qnaupdateform")
	public String qnaupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "qnaupdate";
	}

	// ����
	@RequestMapping("qnaupdate")
	public String qnainsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/qnalist";
		else
			return "qnaupdateform";
	}
	// ����

	@RequestMapping("qnadeleteform")
	public String qnadeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "qnadeleteform";
	}

	@RequestMapping("qnadelete")
	public String qnadelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/qnalist";
		else
			return "qnadeleteform";
	}

	// ������-Q&A ��

	// ������-�Խ��� ��û
	// Input_Form

	@RequestMapping("/bbsrequestinputForm")
	public String bbsrequestinputForm() {
		return "bbsrequestinput_form";
	}

	// ������-�Խ��� ��û insert
	@RequestMapping("/bbsrequestinsert")
	public String bbsrequestinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "bbsrequestresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:bbsrequestinput";
	}

	// ������-�Խ��� ��û List
	@RequestMapping("bbsrequestlist")
	public String bbsrequestlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("bbsrequestlist", list);

		}
		return "bbsrequestlist";
	}

	// ������-�Խ��� ��û ���� ��
	@RequestMapping("bbsrequestupdateform")
	public String bbsrequestupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bbsrequestupdate";
	}

	// ����
	@RequestMapping("bbsrequestupdate")
	public String bbsrequestinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/bbsrequestlist";
		else
			return "bbsrequestupdateform";
	}
	// ����

	@RequestMapping("bbsrequestdeleteform")
	public String bbsrequestdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bbsrequestdeleteform";
	}

	@RequestMapping("bbsrequestdelete")
	public String bbsrequestdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/bbsrequestlist";
		else
			return "bbsrequestdeleteform";
	}

	// ������-�Խ��� ��û ��

	// �������� ����

	// �������� ���� Input_Form

	@RequestMapping("/noticecommentinputForm")
	public String noticecommentnputForm() {
		return "noticecommentinput_form";
	}

	// �������� ���� insert
	@RequestMapping("/noticecommentinsert")
	public String noticecommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", "�������� ���� �Խñ��� �ö󰬽��ϴ�.");
				return "noticecommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:noticecommentnput";
	}

	// List
	@RequestMapping("noticecommentlist")
	public String noticecommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 11) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("noticecommentlist", list);

		}
		return "noticecommentlist";
	}

	// ���� ��
	@RequestMapping("noticecommentupdateform")
	public String noticecommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "noticecommentupdate";
	}

	// ����
	@RequestMapping("noticecommentupdate")
	public String noticecommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/noticecommentlist";
		else
			return "noticecommentupdateform";
	}
	// ����

	@RequestMapping("noticecommentdeleteform")
	public String noticecommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "noticecommentdeleteform";
	}

	@RequestMapping("noticecommentdelete")
	public String noticecommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/noticecommentlist";
		else
			return "noticecommentdeleteform";
	}

	// �������� ���� ��

	// ���� ����

	// ���� ���� Input_Form

	@RequestMapping("/newscommentinputForm")
	public String newscommentinputForm() {
		return "newscommentinput_form";
	}

	// ���� ���� insert
	@RequestMapping("/newscommentinsert")
	public String newscommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� ���� �ö󰬽��ϴ�.");
				return "newscommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:newscommentinput";
	}

	// ���� ���� List
	@RequestMapping("newscommentlist")
	public String newscommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("newscommentlist", list);

		}
		return "newscommentlist";
	}

	// ���� ���� ���� ��
	@RequestMapping("newscommentupdateform")
	public String newscommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "newscommentupdate";
	}

	// ����
	@RequestMapping("newscommentupdate")
	public String newscommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/newscommentlist";
		else
			return "newscommentupdateform";
	}
	// ����

	@RequestMapping("newscommentdeleteform")
	public String newscommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "newscommentdeleteform";
	}

	@RequestMapping("newscommentdelete")
	public String newscommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/newscommentlist";
		else
			return "newscommentdeleteform";
	}

	// ���� ���� ��

	// ���ڸ� ���� ����
	// Input_Form

	@RequestMapping("/jobcommentinputForm")
	public String jobcommentinputForm() {
		return "jobcommentinput_form";
	}

	// ���ڸ����� insert
	@RequestMapping("/jobcommentinsert")
	public String jobcommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "jobcommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:jobcommentinput";
	}

	// ���ڸ����� List
	@RequestMapping("jobcommentlist")
	public String jobcommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("jobcommentlist", list);

		}
		return "jobcommentlist";
	}

	// ���ڸ����� ���� ��
	@RequestMapping("jobcommentupdateform")
	public String jobcommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "jobcommentupdate";
	}

	// ����
	@RequestMapping("jobcommentupdate")
	public String jobcommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/jobcommentlist";
		else
			return "jobcommentupdateform";
	}
	// ����

	@RequestMapping("jobcommentdeleteform")
	public String jobcommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "jobcommentdeleteform";
	}

	@RequestMapping("jobcommentdelete")
	public String jobcommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/jobcommentlist";
		else
			return "jobcommentdeleteform";
	}

	// ���ڸ����� ��

	// �Ƿ�-�ŷ� ����
	// Input_Form

	@RequestMapping("/tradecommentinputForm")
	public String tradecommentinputForm() {
		return "tradecommentinput_form";
	}

	// �Ƿ�-�ŷ� ���� insert
	@RequestMapping("/tradecommentinsert")
	public String tradecommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "tradecommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:tradecommentinput";
	}

	// �Ƿ�-�ŷ� ���� List
	@RequestMapping("tradecommentlist")
	public String tradecommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("tradecommentlist", list);

		}
		return "tradecommentlist";
	}

	// �Ƿ�-�ŷ� ���� ���� ��
	@RequestMapping("tradecommentupdateform")
	public String tradecommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "tradecommentupdate";
	}

	// ����
	@RequestMapping("tradecommentupdate")
	public String tradecommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/tradecommentlist";
		else
			return "tradecommentupdateform";
	}
	// ����

	@RequestMapping("tradecommentdeleteform")
	public String tradecommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "tradecommentdeleteform";
	}

	@RequestMapping("tradecommentdelete")
	public String tradecommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/tradecommentlist";
		else
			return "tradecommentdeleteform";
	}

	// �Ƿ�-�ŷ� ���� ��

	// �Ƿ�-��������
	// Input_Form

	@RequestMapping("/questioncommentinputForm")
	public String questioncommentinputForm() {
		return "questioncommentinput_form";
	}

	// �Ƿ�-�������� insert
	@RequestMapping("/questioncommentinsert")
	public String questioncommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "questioncommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:questioncommentinput";
	}

	// �Ƿ�-�������� List
	@RequestMapping("questioncommentlist")
	public String questioncommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("questioncommentlist", list);

		}
		return "questioncommentlist";
	}

	// �Ƿ�-�������� ���� ��
	@RequestMapping("questioncommentupdateform")
	public String questioncommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "questioncommentupdate";
	}

	// ����
	@RequestMapping("questioncommentupdate")
	public String questioncommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/questioncommentlist";
		else
			return "questioncommentupdateform";
	}
	// ����

	@RequestMapping("questioncommentdeleteform")
	public String questioncommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "questioncommentdeleteform";
	}

	@RequestMapping("questioncommentdelete")
	public String questioncommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/questioncommentlist";
		else
			return "questioncommentdeleteform";
	}

	// �Ƿ�-�������� ��

	// �Ƿ�-�ı� ����
	// Input_Form

	@RequestMapping("/reviewcommentinputForm")
	public String reviewcommentinputForm() {
		return "reviewcommentinput_form";
	}

	// �Ƿ�-�ŷ� insert
	@RequestMapping("/reviewcommentinsert")
	public String reviewcommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "reviewcommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:reviewcommentinput";
	}

	// �Ƿ�-�ı� ���� List
	@RequestMapping("reviewcommentlist")
	public String reviewcommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("reviewcommentlist", list);

		}
		return "reviewcommentlist";
	}

	// �Ƿ�-�ı� ���� ���� ��
	@RequestMapping("reviewcommentupdateform")
	public String reviewcommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "reviewcommentupdate";
	}

	// ����
	@RequestMapping("reviewcommentupdate")
	public String reviewcommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/reviewcommentlist";
		else
			return "reviewcommentupdateform";
	}
	// ����

	@RequestMapping("reviewcommentdeleteform")
	public String reviewcommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "reviewcommentdeleteform";
	}

	@RequestMapping("reviewcommentdelete")
	public String reviewcommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/reviewcommentlist";
		else
			return "reviewcommentdeleteform";
	}

	// �Ƿ�-�ı� ���� ��

	// �Խ���-��ü��� ����
	// Input_Form

	@RequestMapping("/bodycommentinputForm")
	public String bodycommentinputForm() {
		return "bodycommentinput_form";
	}

	// �Խ���-��ü��� ���� insert
	@RequestMapping("/bodycommentinsert")
	public String bodycommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "bodycommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:bodycommentinput";
	}

	// �Խ���-��ü��� ���� List
	@RequestMapping("bodycommentlist")
	public String bodycommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("bodycommentlist", list);

		}
		return "bodycommentlist";
	}

	// �Խ���-��ü��� ���� ���� ��
	@RequestMapping("bodycommentupdateform")
	public String bodycommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bodycommentupdate";
	}

	// ����
	@RequestMapping("bodycommentupdate")
	public String bodycommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/bodycommentlist";
		else
			return "bodycommentupdateform";
	}
	// ����

	@RequestMapping("bodycommentdeleteform")
	public String bodycommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bodycommentdeleteform";
	}

	@RequestMapping("bodycommentdelete")
	public String bodycommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/bodycommentlist";
		else
			return "bodycommentdeleteform";
	}

	// �Խ���-��ü��� ���� ��

	// �Խ���-������� ����
	// Input_Form

	@RequestMapping("/headinputForm")
	public String headinputForm() {
		return "headinput_form";
	}

	// �Խ���-������� ���� insert
	@RequestMapping("/mentalcommentinsert")
	public String mentalcommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "mentalcommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:mentalcommentinput";
	}

	// �Խ���-������� ���� List
	@RequestMapping("mentalcommentlist")
	public String mentalcommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("mentalcommentlist", list);

		}
		return "mentalcommentlist";
	}

	// �Խ���-������� ���� ���� ��
	@RequestMapping("mentalcommentupdateform")
	public String mentalcommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "mentalcommentupdate";
	}

	// ����
	@RequestMapping("mentalcommentupdate")
	public String mentalcommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/mentalcommentlist";
		else
			return "mentalcommentupdateform";
	}
	// ����

	@RequestMapping("mentalcommentdeleteform")
	public String mentalcommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "mentalcommentdeleteform";
	}

	@RequestMapping("mentalcommentdelete")
	public String mentalcommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/mentalcommentlist";
		else
			return "mentalcommentdeleteform";
	}

	// �Խ���-������� ���� ��

	// �Խ���-��ȣȸ ����
	// Input_Form

	@RequestMapping("/clubcommentinputForm")
	public String clubcommentinputForm() {
		return "clubcommentinput_form";
	}

	// �Խ���-��ȣȸ ���� insert
	@RequestMapping("/clubcommentinsert")
	public String clubcommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "clubcommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:clubcommentinput";
	}

	// �Խ���-��ȣȸ ���� List
	@RequestMapping("clubcommentlist")
	public String clubcommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("clubcommentlist", list);

		}
		return "clubcommentlist";
	}

	// �Խ���-��ȣȸ ���� ���� ��
	@RequestMapping("clubcommentupdateform")
	public String clubcommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "clubcommentupdate";
	}

	// ����
	@RequestMapping("clubcommentupdate")
	public String clubcommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/clubcommentlist";
		else
			return "clubcommentupdateform";
	}
	// ����

	@RequestMapping("clubcommentdeleteform")
	public String clubcommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "clubcommentdeleteform";
	}

	@RequestMapping("clubcommentdelete")
	public String clubcommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/clubcommentlist";
		else
			return "clubcommentdeleteform";
	}

	// �Խ���-��ȣȸ ���� ��

	// �Խ���-���� ����
	// Input_Form

	@RequestMapping("/travelcommentinputForm")
	public String travelcommentinputForm() {
		return "travelcommentinput_form";
	}

	// �Խ���-���� ���� insert
	@RequestMapping("/travelcommentinsert")
	public String travelcommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "travelcommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:travelcommentinput";
	}

	// �Խ���-���� ���� List
	@RequestMapping("travelcommentlist")
	public String travelcommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("travelcommentlist", list);

		}
		return "travelcommentlist";
	}

	// �Խ���-���� ���� ���� ��
	@RequestMapping("travelcommentupdateform")
	public String travelcommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "travelcommentupdate";
	}

	// ����
	@RequestMapping("travelcommentupdate")
	public String travelcommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/travelcommentlist";
		else
			return "travelcommentupdateform";
	}
	// ����

	@RequestMapping("travelcommentdeleteform")
	public String travelcommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "travelcommentdeleteform";
	}

	@RequestMapping("travelcommentdelete")
	public String travelcommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/travelcommentlist";
		else
			return "travelcommentdeleteform";
	}

	// �Խ���-���� ���� ��

	// ������-Q&A����
	// Input_Form

	@RequestMapping("/qnacommentinputForm")
	public String qnacommentinputForm() {
		return "qnacommentinput_form";
	}

	// ������-Q&A���� insert
	@RequestMapping("/qnacommentinsert")
	public String qnacommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "qnacommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:qnacommentinput";
	}

	// ������-Q&A���� List
	@RequestMapping("qnacommentlist")
	public String qnacommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("qnacommentlist", list);

		}
		return "qnacommentlist";
	}

	// ������-Q&A���� ���� ��
	@RequestMapping("qnacommentupdateform")
	public String qnacommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "qnacommentupdate";
	}

	// ����
	@RequestMapping("qnacommentupdate")
	public String qnacommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/qnacommentlist";
		else
			return "qnacommentupdateform";
	}
	// ����

	@RequestMapping("qnacommentdeleteform")
	public String qnacommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "qnacommentdeleteform";
	}

	@RequestMapping("qnacommentdelete")
	public String qnacommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/qnacommentlist";
		else
			return "qnacommentdeleteform";
	}

	// ������-Q&A���� ��

	// ������-�Խ��� ��û ����
	// Input_Form

	@RequestMapping("/bbsrequestcommentinputForm")
	public String bbsrequestcommentinputForm() {
		return "bbsrequestcommentinput_form";
	}

	// ������-�Խ��� ��û ���� insert
	@RequestMapping("/bbsrequestcommentinsert")
	public String bbsrequestcommentinsert(Model m, BbsBean b) {

		try {
			if (bd.insert(b)) {
				m.addAttribute("msg", " ���� �ö󰬽��ϴ�.");
				return "bbsrequestcommentresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:bbsrequestcommentinput";
	}

	// ������-�Խ��� ��û ���� List
	@RequestMapping("bbsrequestcommentlist")
	public String bbsrequestcommentlist(@RequestParam int no, int boardno, Model model) {

		if (boardno == 12) {
			List<BbsBean> list = bd.selectAll();
			model.addAttribute("bbsrequestcommentlist", list);

		}
		return "bbsrequestcommentlist";
	}

	// ������-�Խ��� ��û ���� ���� ��
	@RequestMapping("bbsrequestcommentupdateform")
	public String bbsrequestcommentupdateForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bbsrequestcommentupdate";
	}

	// ����
	@RequestMapping("bbsrequestcommentupdate")
	public String bbsrequestcommentinsert(BbsBean bb) throws SQLException {
		if (bd.update(bb))
			return "redirect:/bbsrequestcommentlist";
		else
			return "bbsrequestcommentupdateform";
	}
	// ����

	@RequestMapping("bbsrequestcommentdeleteform")
	public String bbsrequestcommentdeleteForm(@RequestParam int no, int boardno, Model model) {
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "bbsrequestcommentdeleteform";
	}

	@RequestMapping("bbsrequestcommentdelete")
	public String bbsrequestcommentdelete(int no, int boardno) throws SQLException {
		if (bd.delete(no, boardno))
			return "redirect:/bbsrequestcommentlist";
		else
			return "bbsrequestcommentdeleteform";
	}
  
	
	// ������-�Խ��� ��û ���� ��
}

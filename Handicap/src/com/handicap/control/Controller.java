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
	//�������� Input_Form
	
	@RequestMapping("/gongjiinputForm")
	public String gongjinputForm(){
		return "gonginput_form";
	}
	
	//�������� insert 
	@RequestMapping("/gongjiinsert")
	public String gongjiinsert(Model m, BbsBean b){ 
		
		try {
			if(bd.insert(b)){
				m.addAttribute("msg","�������� �Խñ��� �ö󰬽��ϴ�.");
				return "gongresult";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:gongjinput";
	}
	
	// List	
	@RequestMapping("gonglist")
	public String list(@RequestParam int no, int boardno, Model model){
		boardno = bbs
		
		if(boardno){
		List<BbsBean> list = bd.selectAll();
		model.addAttribute("gonglist",list);
		}
		return "gonglist";
	}
	
	//���� ��
	@RequestMapping("gongupdateform")
	public String gongupdateForm(@RequestParam int no, int boardno, Model model){
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "gongupdate";
	}
	
	//����
	@RequestMapping("gongupdate")
	public String gonginsert(BbsBean bb) throws SQLException{
		if(bd.update(bb)) return "redirect:/gonglist";
		else return "gongupdateform";
	}
	// ����
	
	@RequestMapping("gongdeleteform")
	public String gongdeleteForm(@RequestParam int no, int boardno, Model model){
		model.addAttribute("bbsBean", bd.select(no, boardno));
		return "gongdeleteform";
	}
	
	@RequestMapping("gongdelete")
		public String gongdelete(int no, int boardno) throws SQLException{
		if(bd.delete(no, boardno)) return "redirect:/gonglist";
		else return "gongdeleteform";
		}
	

	//�������� ��
}

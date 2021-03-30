package com.example.wbdvsp2101sunchihmserverjava.services;

import com.example.wbdvsp2101sunchihmserverjava.controllers.WidgetController;
import com.example.wbdvsp2101sunchihmserverjava.models.Widget;
import com.example.wbdvsp2101sunchihmserverjava.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WidgetService {

    @Autowired
    WidgetRepository repository;

//    private List<Widget> widgets = new ArrayList<Widget>();
//    {
//        Widget w1 = new Widget("First Widget", 123L, "HEADING", 123, "Welcome to Widgets",
//                "www.wedgets.com", 1, 5, "cssClass", "Normal", "1", "ABC123");
//        Widget w2 = new Widget("Second Widget", 234L, "PARAGRAPH", 234, "This is a paragraph",
//                "www.paragraph.com", 1, 4, "cssClass1", "High", "2", "BCD234");
//        Widget w3 = new Widget("Third Widget", 345L, "HEADING", 345, "Welcome to Webdev",
//                "www.webdev.com", 2, 3, "cssClass2", "Low", "3", "BCD234");
//        Widget w4 = new Widget("Fourth Widget", 456L, "PARAGRAPH", 456, "Lorem Ipsum",
//                "www.loremipsum.com", 2, 2, "cssClass3", "Medium", "4", "BCD234");
//
//        widgets.add(w1);
//        widgets.add(w2);
//        widgets.add(w3);
//        widgets.add(w4);
//    }
    // implement crud operations

    public Widget creatWidgetForTopic(Widget widget) {
        return repository.save(widget);
//        widget.setTopicId(tid);
//        Long id = (new Date()).getTime();
//        widget.setId(id);
//        widgets.add(widget);
//        return widget;
    }

    public List<Widget> findAllWidgets() {
        return repository.findAllWidgets();
//        return (List<Widget>) repository.findAll();
//        return widgets;
    }

    public List<Widget> findWidgetsForTopic(String topicId) {
        return repository.findWidgetsForTopic(topicId);
//        List<Widget> ws = new ArrayList<Widget>();
//        for(Widget w: widgets) {
//            if(w.getTopicId().equals(topicId)) {
//                ws.add(w);
//            }
//        }
//        return ws;
    }

    public Widget findWidgetById(Long id) {
        return repository.findWidgetById(id);
//        return repository.findById(id).get();
    }
//        for(Widget w: widgets) {
//            if(w.getId().equals(id)) {
//                return w;
//            }
//        }
//        return null;
//    }

    public Integer updateWidget(Long id, Widget newWidget) {
        Widget originalWidget = findWidgetById(id);
        originalWidget.setText(newWidget.getText());
        originalWidget.setSrc(newWidget.getSrc());
        //todo if src is null then do
        repository.save(originalWidget);
        return 1;
//        for (int i=0; i<widgets.size(); i++) {
//            if(widgets.get(i).getId().equals(id)) {
//                widgets.set(i, newWidget);
//                return 1;
//            }
//        }
//        return -1;
    }

    public Integer deleteWidget(Long id) {
        repository.deleteById(id);
        return 1;
//        int index = -1;
//        for (int i=0; i<widgets.size(); i++) {
//            if(widgets.get(i).getId().equals(id)) {
//                index = i;
//            }
//        }
//        if(index>=0) {
//            widgets.remove(index);
//            return 1;
//        }
//        return -1;
    }
}
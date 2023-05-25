package com.mycompany.backendapplication;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "document")
@NamedQueries({
        @NamedQuery(name = "Document.findByDocumentId", query = "select d from Document d where d.documentId = :documentId"),
        @NamedQuery(name = "Document.findAll", query = "select d from Document d")
})
public class Document implements Serializable {

    @Serial
    private static final long serialVersionUID = 7783021874134133597L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int documentId;
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Document() {

    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int id) {
        this.documentId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
